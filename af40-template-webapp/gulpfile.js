var gulp = require('gulp')
var inject = require('gulp-inject');
var concat = require('gulp-concat');
var runSequence = require('run-sequence');
var naturalSort = require('gulp-natural-sort');
var uglify = require('gulp-uglify');
var bowerFiles = require('main-bower-files');
var angularFilesort = require('gulp-angular-filesort');
var sourcemaps = require('gulp-sourcemaps');

var config = require('./gulp/config');

gulp.task('default', function () {
});

gulp.task('inject:vendor', function () {
	var stream = gulp.src(config.rootPath + 'index.html')
	.pipe(inject(gulp.src(bowerFiles(), {read: false}), {
            name: 'bower',
            relative: true
        }))
    .pipe(gulp.dest('./src/main/resources/static'));
});

gulp.task('inject:app:dev', function () {
	var stream = gulp.src(config.rootPath + 'index.html')
	.pipe(inject(gulp.src(config.injectAppDev)
			.pipe(naturalSort())
            .pipe(angularFilesort()), {relative: true}))
	.pipe(gulp.dest(config.rootPath));
});

gulp.task('inject:app:prod', function () {
	var stream = gulp.src(config.rootPath + 'index.html')
	.pipe(inject(gulp.src(config.injectAppProd)
			.pipe(naturalSort())
            .pipe(angularFilesort()), {relative: true}))
	.pipe(gulp.dest(config.rootPath));
});

gulp.task('inject', function () {
    runSequence('inject:vendor');
});

gulp.task('app-scripts', function() {
	  return gulp.src(config.minifyApp)
	    .pipe(sourcemaps.init())
	     .pipe(uglify())
	     .pipe(concat('app.min.js'))
	    .pipe(sourcemaps.write())
	    .pipe(gulp.dest('./src/main/resources/static'));
});

gulp.task('build', function () {
    runSequence('inject', 'app-scripts', 'inject:app:prod');
});

gulp.task('build:dev', function () {
    runSequence('inject', 'app-scripts', 'inject:app:dev');
});
