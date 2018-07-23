SUMMARY = "Wayland C++ bindings"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a5cc4054bb22e2938ebde6e4196d618"

inherit cmake

SRCREV = "bd6655b9507659a486b2808d1bbceea06e5b0d0a"
SRC_URI = "git://github.com/NilsBrause/waylandpp.git"

DEPENDS = "wayland mesa"

#OECMAKE_GENERATOR="Unix Makefiles"

S = "${WORKDIR}/git"

EXTRA_OECMAKE = "-DBUILD_DOCUMENTATION=OFF -DBUILD_LIBRARIES=ON -DBUILD_EXAMPLES=OFF -DBUILD_SCANNER=OFF -DWAYLAND_SCANNERPP=/usr/bin/wayland-scanner++"

#do_install() {
#	oe_runmake install DESTDIR="${D}" PREFIX="${prefix}"
#}
