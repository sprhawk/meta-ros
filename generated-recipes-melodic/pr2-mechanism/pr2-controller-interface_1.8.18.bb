# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package specifies the interface to a realtime controller. A    controller that implements this interface can be executed by the     <a href="http://www.ros.org/wiki/pr2_controller_manager">controller   manager</a> in the real time control loop. The package basically   contains the C++ controller base class that all controllers need to   inherit from."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Wim Meeussen"
HOMEPAGE = "http://ros.org/wiki/pr2_controller_interface"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_mechanism"
ROS_BPN = "pr2_controller_interface"

ROS_BUILD_DEPENDS = " \
    controller-interface \
    pr2-mechanism-model \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-interface \
    pr2-mechanism-model \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-interface \
    pr2-mechanism-model \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_mechanism-release/archive/release/melodic/pr2_controller_interface/1.8.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4084084a1df93084b87175a077c1e627"
SRC_URI[sha256sum] = "0a6ffaecfd981a9b21e8895ac582bff371da30a6526c97a933827b9a97bf7607"
S = "${WORKDIR}/pr2_mechanism-release-release-melodic-pr2_controller_interface-1.8.18-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-mechanism', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-mechanism', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-mechanism/pr2-mechanism_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-mechanism/pr2-mechanism-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-mechanism/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-mechanism/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}