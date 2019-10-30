SUMMARY = "Icon Naming Utilities"
DESCRIPTION = "icon-naming-utils is a script for \
maintaining backwards compatibility with current \
desktop icon themes, while migrating to the names \
specified in the Icon Naming Specification"
HOMEPAGE = "http://tango.freedesktop.org/Tango_Icon_Library"
SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

inherit autotools pkgconfig

SRC_URI = "http://tango.freedesktop.org/releases/icon-naming-utils-0.8.90.tar.gz"
SRC_URI[sha256sum] = "044ab2199ed8c6a55ce36fd4fcd8b8021a5e21f5bab028c0a7cdcf52a5902e1c"
SRC_URI[md5sum] = "2c5c7a418e5eb3268f65e21993277fba"

FILES_${PN} += "${libexecdir}/*"
FILES_${PN}-dev += "${datadir}/*"

DEPENDS += "libxml-simple-perl perl"
RDEPENDS_${PN} = "perl"

BBCLASSEXTEND += "native"