package com.xinsu.heartrate.bluetooth.core
object BleReconnectPolicy{
private const val MAX_RETRY=3
private var retry=0
fun allowRetry()=retry++<MAX_RETRY
fun reset(){retry=0}
}
