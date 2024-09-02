echo off
echo ejecuta el estresador para sembrar los clientes
echo uso:
echo 4bis_estresa NumCltes NumSolicitudesPorClte HOSTNAME (en caso de omitirlo se usa localhost, si se omiten los clientes usa 15, 10 solicitudes por cliente)
echo off

set cb=%cd%\tstRMI.jar

if [%1] NEQ [] goto conclientes
java -jar %cb% Lanzador 15 Cliente 10 localhost
goto fin

:conclientes

if [%2] NEQ [] goto consolicitudes
java -jar %cb% Lanzador %1 Cliente 15 localhost 
goto fin

:consolicitudes
if [%3] NEQ [] goto conHost
java -jar %cb% Lanzador %1 Cliente %2 localhost
goto fin

:conHost
java -jar %cb% Lanzador %1 Cliente %2 %3

:fin

rem java -jar "D:\user\Materias\SCE\tstRMI_L\dist\tstRMI_L.jar" Lanzador 5 Cliente 10 localhost