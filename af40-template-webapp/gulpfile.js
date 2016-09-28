var gulp = require('gulp');
var inject = require('gulp-inject');
var concat = require('gulp-concat');
var runSequence = require('run-sequence');
var uglify = require('gulp-uglify');
var bowerFiles = require('main-bower-files');
var angularFilesort = require('gulp-angular-filesort');

var config = require('./gulp/config');

gulp.task('default', function () {
});

gulp.task('inject:dev', function () {
	var stream = gulp.src(config.rootPath + 'index.html')
	.pipe(inject(gulp.src(config.injectAppDev), {relative: true}))
	.pipe(gulp.dest(config.rootPath));
});

gulp.task('inject:prod', function () {
	var stream = gulp.src(config.rootPath + 'index.html')
	.pipe(inject(gulp.src(config.injectAppProd), {relative: true}))
	.pipe(gulp.dest(config.rootPath));
});

gulp.task('minify', function() {
	runSequence('minify:app', 'minify:vendor');
});

gulp.task('minify:app', function() {
	  return gulp.src(config.minifyApp)
	     .pipe(uglify())
	     .pipe(concat('app.min.js'))
	    .pipe(gulp.dest(config.jsPath));
});

gulp.task('minify:vendor', function() {
	  return gulp.src(config.injectVendor)
	     .pipe(uglify())
	     .pipe(concat('vendor.min.js'))
	    .pipe(gulp.dest(config.jsPath));
});

gulp.task('build', function () {
    runSequence('minify', 'inject:prod');
});

gulp.task('build:dev', function () {
    runSequence('minify', 'inject:dev');
});
