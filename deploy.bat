@echo on
@echo =============================================================
@echo $                                                           $
@echo $                       Nepxion Banner                      $
@echo $                                                           $
@echo $                                                           $
@echo $                                                           $
@echo $  Nepxion Studio All Right Reserved                        $
@echo $  Copyright (C) 2017-2050                                  $
@echo $                                                           $
@echo =============================================================
@echo.
@echo off

@title Nepxion Banner
@color 0a

call mvn clean deploy -DskipTests -e -P release

pause