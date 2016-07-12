package org.lavenderx.idioms

import org.junit.Assert.assertEquals
import org.junit.Test

class UserTest {

    @Test fun testDataClasses(): Unit {
        val user = User("Baymax", 25, "dolphineor@gmail.com")

        assertEquals("User(name=Baymax, age=25, email=dolphineor@gmail.com)", user.toString())
    }
}