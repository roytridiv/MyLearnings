package com.obhai.mylearnings.di

import android.content.Context
import com.obhai.mylearnings.BaseApplication
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class MyLearning {

    /*@Singleton
    @Binds
    abstract fun myAbstractFunction(
         text :String
    )*/
}

@Module
@InstallIn(SingletonComponent::class)
object MyLearningModule {

    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): BaseApplication {
        return app as BaseApplication
    }

    @Singleton
    @Provides
    @Named("test_string1")
    fun provideTestString(): String {
        return "this is a test TEXT 1"
    }

    @Singleton
    @Provides
    @Named("test_string2")
    fun provideTestString2(): String {
        return "this is a test TEXT 2"
    }


}