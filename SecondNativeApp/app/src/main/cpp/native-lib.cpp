#include <jni.h>
#include <string>
#include <math.h>

extern "C" JNIEXPORT jint JNICALL
Java_com_example_floatingcalculation_NativeLibrary_calSinAndCos(JNIEnv *env, jobject thiz,
                                                                jdouble radian) {
    double sinValue = 0, cosValue = 0;
    clock_t t_start, t_end;
    t_start = clock()/(CLOCKS_PER_SEC/1000);

    sinValue = sin(radian);
    cosValue = cos(radian);

    t_end = clock()/(CLOCKS_PER_SEC/1000);
    return t_end-t_start;
}

extern "C" JNIEXPORT jint JNICALL
Java_com_example_floatingcalculation_NativeLibrary_calVolumeSphere(JNIEnv *env, jobject thiz,
                                                                jdouble r) {
    float pi = 3.14285714286;
    double volume = 0;
    clock_t t_start, t_end;
    t_start = clock()/(CLOCKS_PER_SEC/1000);

    volume = (4/3) * pi * r * r * r;

    t_end = clock()/(CLOCKS_PER_SEC/1000);
    return t_end-t_start;
}