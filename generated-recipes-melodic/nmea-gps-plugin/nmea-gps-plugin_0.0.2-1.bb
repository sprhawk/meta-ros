# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The nmea_gps_plugin package"
AUTHOR = "Masaya Kataoka <ms.kataoka@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "nmea_gps_plugin"
ROS_BPN = "nmea_gps_plugin"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gazebo} \
    gazebo-ros \
    geodesy \
    geographic-msgs \
    libeigen \
    nmea-msgs \
    quaternion-operation \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gazebo} \
    gazebo-ros \
    geodesy \
    geographic-msgs \
    libeigen \
    nmea-msgs \
    quaternion-operation \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gazebo} \
    gazebo-ros \
    geodesy \
    libeigen \
    nmea-msgs \
    quaternion-operation \
    roscpp \
    rosdoc-lite \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/OUXT-Polaris/nmea_gps_plugin-release/archive/release/melodic/nmea_gps_plugin/0.0.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7a3dceaee0e963d9e6a58b80b75a88cc"
SRC_URI[sha256sum] = "bf0ecd5604699384b818ed34494c93bc8faee1e3645a8e3d9bd58e4e17256f8d"
S = "${WORKDIR}/nmea_gps_plugin-release-release-melodic-nmea_gps_plugin-0.0.2-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('nmea-gps-plugin', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('nmea-gps-plugin', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/nmea-gps-plugin/nmea-gps-plugin_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/nmea-gps-plugin/nmea-gps-plugin-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/nmea-gps-plugin/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/nmea-gps-plugin/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}