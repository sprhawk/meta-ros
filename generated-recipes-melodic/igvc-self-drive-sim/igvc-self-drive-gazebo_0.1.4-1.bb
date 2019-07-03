# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Gazebo models and runtime configuration for igvc_self_drive simulator"
AUTHOR = "Micho Radovnikovich <mtradovn@oakland.edu>"
ROS_AUTHOR = "Micho Radovnikovich <mtradovn@oakland.edu>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=6c4b0dfc2c040991f7798d2c24b8fc03"

ROS_CN = "igvc_self_drive_sim"
ROS_BPN = "igvc_self_drive_gazebo"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-ros \
    robot-state-publisher \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/robustify/igvc_self_drive_sim-release/archive/release/melodic/igvc_self_drive_gazebo/0.1.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ceb7de4d1591679a5ae2d421b66de108"
SRC_URI[sha256sum] = "8b83406423a8bcc6de599c32df446a7165145353418a9c5e279c43a0b9f08e4e"
S = "${WORKDIR}/igvc_self_drive_sim-release-release-melodic-igvc_self_drive_gazebo-0.1.4-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('igvc-self-drive-sim', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('igvc-self-drive-sim', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/igvc-self-drive-sim/igvc-self-drive-sim_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/igvc-self-drive-sim/igvc-self-drive-sim-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/igvc-self-drive-sim/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/igvc-self-drive-sim/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}