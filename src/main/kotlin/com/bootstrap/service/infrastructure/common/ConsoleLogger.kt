package com.bootstrap.service.infrastructure.common

import com.bootstrap.service.common.LogLevel
import com.bootstrap.service.common.LoggerWrapper

class ConsoleLogger(
    private val logLevel: LogLevel
) : LoggerWrapper {

    override fun debug(stringSupplier: () -> String) {
        if (logLevel.level <= LogLevel.DEBUG.level) {
            print(LogLevel.DEBUG, stringSupplier)
        }
    }

    override fun info(stringSupplier: () -> String) {
        if (logLevel.level <= LogLevel.INFO.level) {
            print(LogLevel.INFO, stringSupplier)
        }
    }

    override fun warn(stringSupplier: () -> String) {
        if (logLevel.level <= LogLevel.WARN.level) {
            print(LogLevel.WARN, stringSupplier)
        }
    }

    override fun error(stringSupplier: () -> String) {
        if (logLevel.level <= LogLevel.ERROR.level) {
            print(LogLevel.ERROR, stringSupplier)
        }
    }

    override fun fatal(stringSupplier: () -> String) {
        if (logLevel.level <= LogLevel.FATAL.level) {
            print(LogLevel.FATAL, stringSupplier)
        }

    }

    companion object {
        private fun print(level: LogLevel, stringSupplier: () -> String) {
            println("${level}: ${stringSupplier()}")
        }

    }

}
