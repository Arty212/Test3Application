package com.example.test3application


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.random.Random


const val NOTIFICATION_ID = 2
const val NOTIFICATION_CHANNEL_ID = "com.example.test3application"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* val array = arrayOfNulls<Int>(10000000)
         array.forEach { println(it) }*/

        /*val thread = Thread {
                Thread.sleep(10000)
            }
            thread.name = "MyThread"
            thread.start()*/

        /* for (i in 1..10) {
             thread(name = "MyThread_$i", start = true) {
                 Log.d("MyThread", Thread.currentThread().name)
                 Thread.sleep(10000)
             }
         }
         Log.d("MyThread", Thread.currentThread().name)*/

        /*var account = Account(100)
        for (i in 1..10) {
            thread(name = "MyThread_$i", start = true) {
                account.withdrawal(Random.nextLong(10, 100))
                account.deposit(Random.nextLong(10, 20))
            }
        }*/

        /* var account = Account(100)
         for (i in 1..10) {
             account.withdrawal(Random.nextLong(10, 100))
             account.deposit(Random.nextLong(10, 20)) { balance ->
                 Log.d("MyThread", "balance:$balance")
             }
         }*/


        var account = Account(100)

        for (i in 1..10) {
            CoroutineScope(Dispatchers.IO).launch {
                account.withdrawal(Random.nextLong(10, 100)).also {
                    Log.d("MyThread", "balance:$it")
                }
                account.deposit(Random.nextLong(10, 20))
            }
        }
    }
}
