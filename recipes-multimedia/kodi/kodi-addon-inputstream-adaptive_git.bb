SUMMARY = "kodi inputstream addon for several manifest types"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/main.cpp;beginline=1;endline=17;md5=5eac1e215251c8f88d799f80ed45d5c0"

inherit kodi-addon

DEPENDS += "expat"

SRCREV = "b28d3f047e8f8c7c6eec68717ae8a6feac2b2891"


PV = "2.1.13+gitr${SRCPV}"
SRC_URI = "git://github.com/peak3d/inputstream.adaptive.git;protocol=https \
          "

S = "${WORKDIR}/git"

KODIADDONNAME = "inputstream.adaptive"
