@echo off

rem  ============================================
rem
rem  Used for Creating Idea Project files Command-line
rem  mode (WinNT/2K/Win7 only)
rem
rem  ============================================

echo Select a option to Clean and Create the Idea project
echo Press 1 for All; 2 for Demo
echo.

set /p opt="Enter Choice: " %=%

set install_dir="%~dp0.."

pushd %install_dir%

echo moved to %install_dir%

if %opt%==1 (
call mvn idea:clean idea:idea -Pwmp
) 

if %opt%==2 (
call mvn idea:clean idea:idea -Pwmp
)

pause
popd