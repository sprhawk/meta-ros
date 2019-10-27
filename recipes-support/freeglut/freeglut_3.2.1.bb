DESCRIPTION = "FreeGLUT is a free-software/open-source alternative to the OpenGL \
               Utility Toolkit (GLUT) library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=89c0b58a3e01ce3d8254c9f59e78adfb"

SRC_URI = "https://sourceforge.net/projects/${BPN}/files/${BPN}/${PV}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cd5c670c1086358598a6d4a9d166949d"
SRC_URI[sha256sum] = "d4000e02102acaf259998c870e25214739d1f16f67f99cb35e4f46841399da68"

inherit cmake distro_features_check

# virtual/libgl
REQUIRED_DISTRO_FEATURES = "opengl"

PROVIDES += "mesa-glut"

DEPENDS = "libxkbcommon"

EXTRA_OECMAKE += " \
                  -DFREEGLUT_REPLACE_GLUT=ON \
                 "

PACKAGECONFIG[x11] = ",,virtual/libx11 libxmu libxi libxrandr,"
PACKAGECONFIG[wayland] = "-DFREEGLUT_WAYLAND=ON,-DFREEGLUT_WAYLAND=OFF,wayland,"
PACKAGECONFIG[gles] = "-DFREEGLUT_GLES=ON,-DFREEGLUT_GLES=OFF,virtual/libgles2,"
PACKAGECONFIG[demos] = "-DFREEGLUT_BUID_DEMOS=ON,-DFREEGLUT_BUILD_DEMOS=OFF,,"

PACKAGECONFIG ??= " \
                   ${@bb.utils.contains("DISTRO_FEATURES", "x11", "x11", "wayland", d)} \
                   gles \
                  "

