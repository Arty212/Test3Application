package com.example.test3application

import android.util.Log
import androidx.annotation.WorkerThread
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.util.*
import kotlin.concurrent.thread
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine
import kotlin.random.Random

class Account(@Volatile var balance: Long) {

    /*fun deposit(account: Long) {
        Thread.sleep(Random.nextLong(100, 1000))
        balance += account
        Log.d("MyThread", "deposit:$account balance:$balance")
    }


    fun withdrawal(account: Long) {
        Thread.sleep(Random.nextLong(100, 10000))
        synchronized(this) {
            if (balance >= account) {
                Thread.sleep(Random.nextLong(100, 1000))
                balance -= account
            } else {
                (this as Object).wait()
            }
        }
        Log.d("MyThread", "withdrawal:$account balance:$balance")
    }*/

    /*  fun deposit(account: Long, handler: (balance: Long) -> Unit) {
          thread(start = true) {
              synchronized(this) {
                  Thread.sleep(Random.nextLong(100, 1000))
                  balance += account
                  (this as Object).notifyAll()
              }
              handler(balance)

          }
      }


      fun withdrawal(account: Long) {
          thread(start = true) {
              Thread.sleep(Random.nextLong(100, 10000))
              synchronized(this) {
                  if (balance >= account) {
                      Thread.sleep(Random.nextLong(100, 1000))
                      balance -= account
                  } else {
                      (this as Object).wait()
                  }
              }
              Log.d("MyThread", "withdrawal:$account balance:$balance")
          }
      }*/

  /*  val mutex = Mutex()

    suspend fun deposit(account: Long) {
        mutex.withLock {
            delay(500)
            balance += account
        }
    }

    @Synchronized
    suspend fun withdrawal(account: Long): Long {
        mutex.withLock {
            delay(1000)
            if (balance >= account) {
                balance -= account
            }
        }
        return suspendCoroutine { continuation -> continuation.resume(balance) }
    }*/
}

