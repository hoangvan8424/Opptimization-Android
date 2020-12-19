#include <jni.h>
#include <string>
#include <math.h>

extern "C" JNIEXPORT jdouble JNICALL
Java_com_example_floatingcalculation_MainActivity_calSinAndCos(
        JNIEnv* env,
        jobject /* this */, jdouble radian) {

    double sinValue = 0, cosValue = 0;

    sinValue = sin(radian);
    cosValue = cos(radian);
    

}