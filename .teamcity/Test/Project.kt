package Test

import Test.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    uuid = "e30836f0-9782-4213-b366-b43d31c94c9d"
    id("Test")
    parentId("_Root")
    name = "test"

    buildType(Test_Testconf)
})
