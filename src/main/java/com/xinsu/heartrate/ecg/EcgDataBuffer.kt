package com.xinsu.heartrate.ecg
object EcgDataBuffer{
private const val MAX=512
private val data=FloatArray(MAX)
private var head=0
fun addY(v:Float){data[head]=v;head=(head+1)%MAX}
fun snapshot():FloatArray{
 val out=FloatArray(MAX)
 for(i in 0 until MAX) out[i]=data[(head+i)%MAX]
 return out
}
fun clear(){for(i in data.indices)data[i]=0f;head=0}
}
