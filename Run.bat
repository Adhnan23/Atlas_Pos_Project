@echo off
set MYSQL_EXECUTABLE="C:\xampp\mysql\bin\mysql.exe"
set DB_USER=root
set DB_PASSWORD=
set DB_HOST=localhost
set DB_NAME=atlas
set SQL_FILE_PATH=dependencies\database\atlas.sql

:: Create the 'atlas' database if it doesn't exist
%MYSQL_EXECUTABLE% -u %DB_USER% -h %DB_HOST% -e "CREATE DATABASE IF NOT EXISTS %DB_NAME%;"

:: Import the SQL file into the 'atlas' database
%MYSQL_EXECUTABLE% -u %DB_USER% -h %DB_HOST% %DB_NAME% < %SQL_FILE_PATH%
