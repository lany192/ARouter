package com.alibaba.android.arouter.register.utils

import java.io.File
import java.io.Serializable

/**
 * register setting
 */
class ScanSetting(interfaceName: String) : Serializable {
    /**
     * scan for classes which implements this interface
     */
    var interfaceName = ""

    /**
     * jar file which contains class: [.GENERATE_TO_CLASS_NAME]
     */
    var fileContainsInitClass: File? = null

    /**
     * scan result for [.interfaceName]
     * class names in this list
     */
    var classSet = HashSet<String>()

    /**
     * constructor for arouter-auto-register settings
     *
     * @param interfaceName interface to scan
     */
    init {
        this.interfaceName = INTERFACE_PACKAGE_NAME + interfaceName
    }

    companion object {
        const val pLUGIN_NAME = "com.alibaba.arouter"

        /**
         * The register code is generated into this class
         */
        const val gENERATE_TO_CLASS_NAME = "com.alibaba.android.arouter.core.LogisticsCenter"

        /**
         * you know. this is the class file(or entry in jar file) name
         */
        const val gENERATE_TO_CLASS_FILE_NAME = gENERATE_TO_CLASS_NAME + ".class"

        /**
         * The register code is generated into this method
         */
        const val gENERATE_TO_METHOD_NAME = "loadRouterMap"

        /**
         * The package name of the class generated by the annotationProcessor
         */
        const val rOUTER_CLASS_PACKAGE_NAME = "com.alibaba.android.arouter.routes."

        /**
         * The package name of the interfaces
         */
        private const val INTERFACE_PACKAGE_NAME = "com.alibaba.android.arouter.facade.template."

        /**
         * register method name in class: [.GENERATE_TO_CLASS_NAME]
         */
        const val rEGISTER_METHOD_NAME = "register"
    }
}