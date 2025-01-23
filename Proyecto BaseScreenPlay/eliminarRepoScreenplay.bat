@echo off
set GIT_DIR="C:\Users\choucair\Desktop\ProyectosBaseSP&POM\Proyecto BaseScreenPlay\.git"
if exist %GIT_DIR% (
    echo Eliminando carpeta .git en %GIT_DIR%...
    rmdir /s /q %GIT_DIR%
    echo Carpeta .git eliminada exitosamente.
) else (
    echo No se encontró ninguna carpeta .git en %GIT_DIR%.
)
echo Cerrando en 5 segundos...
timeout /t 5 > nul
exit