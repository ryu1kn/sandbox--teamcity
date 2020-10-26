package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object localgit : GitVcsRoot({
    uuid = "efed3c5f-ff73-4d48-879e-c85529b60ed1"
    name = "Local Git Repos"
    url = "/git-repos/sample-project"
})
