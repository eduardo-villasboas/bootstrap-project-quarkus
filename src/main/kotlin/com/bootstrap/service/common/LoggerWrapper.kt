package com.bootstrap.service.common

interface LoggerWrapper {


    fun debug(stringSupplier: () -> String)
    fun info(stringSupplier: () -> String)
    fun warn(stringSupplier: () -> String)
    fun error(stringSupplier: () -> String)
    fun fatal(stringSupplier: () -> String)

}