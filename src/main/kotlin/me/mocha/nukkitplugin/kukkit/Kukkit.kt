package me.mocha.nukkitplugin.kukkit

import cn.nukkit.plugin.PluginBase

class Kukkit : PluginBase() {

    companion object {
        lateinit var instance: Kukkit
            private set
    }

    init {
        instance = this
    }

    override fun onLoad() {
        logger.info("Provide Kotlin ${KotlinVersion.CURRENT}")
    }

}