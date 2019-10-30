SUMMARY = "Tango Icon Library"
DESCRIPTION = "Tango Icon Gallery - a sample implementation of the naming spec following the style guidelines."
HOMEPAGE = "http://tango.freedesktop.org/Tango_Icon_Library"
SECTION = "devel"
LICENSE = "PublicDomain"
LIC_FILES_CHKSUM = "file://COPYING;md5=b66026716fdf499434f80b11851a6cdd"

inherit autotools

EXTRA_OECONF = "--host=x86_64"

SRC_URI = "http://tango.freedesktop.org/releases/tango-icon-theme-0.8.90.tar.gz \
           file://0001-fix-configure-to-search-for-icon-name-mapping.patch \
           "
SRC_URI[sha256sum] = "6e98d8032d57d818acc907ec47e6a718851ff251ae7c29aafb868743eb65c88e"
SRC_URI[md5sum] = "0795895d2f20eddcbd2bffe94ed431a6"

# to fix failed to find output of imagemagick
export ac_executable_extensions = ".im7"

# to fix icon-name-mapping dir prefix
export STAGING_DIR_NATIVE

# icon-naming-utils-native to put icon-name-mapping to /usr/libexec/
# icon-naming-utils to fix pkgocnfig path issue
DEPENDS += "intltool-native glib-2.0-native imagemagick-native imagemagick icon-naming-utils-native icon-naming-utils"

FILES_${PN} = "${datadir}/*"