package com.fearaujo.data

import java.math.BigInteger
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

/**
 * Created by felipearaujo on 04/12/16.
 */

class CryptoUtil {

    fun MD5_Hash(s: String): String? {
        val m: MessageDigest?

        try {
            m = MessageDigest.getInstance("MD5")
            m?.update(s.toByteArray(), 0, s.length)
            return BigInteger(1, m.digest()).toString(16)
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }

    }
}
