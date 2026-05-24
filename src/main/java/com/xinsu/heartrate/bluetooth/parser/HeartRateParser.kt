package com.xinsu.heartrate.bluetooth.parser
import android.bluetooth.BluetoothGattCharacteristic
object HeartRateParser{
fun parse(characteristic:BluetoothGattCharacteristic):Int{
 val d=characteristic.value?:return 0
 if(d.isEmpty()) return 0
 val is16=(d[0].toInt() and 0x01)!=0
 val bpm= if(is16 && d.size>2) ((d[1].toInt() and 0xff) or ((d[2].toInt() and 0xff) shl 8)) else d.getOrNull(1)?.toInt()?.and(0xff)?:0
 return bpm.coerceIn(30,220)
}}
