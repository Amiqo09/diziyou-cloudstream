package com.yusiqo
 
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context
 
@CloudstreamPlugin
class GolgetvPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Golgetv())
    }
}