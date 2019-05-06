# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Display object analytics result in rviz"
AUTHOR = "Chris Ye <chris.ye@intel.com>"
ROS_AUTHOR = "Chris Ye"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ros2_object_analytics"
ROS_BPN = "object_analytics_rviz"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    message-filters \
    object-analytics-msgs \
    object-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    message-filters \
    object-analytics-msgs \
    object-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/ros2_object_analytics-release/archive/release/dashing/object_analytics_rviz/0.5.4-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a71814132610882b42d8df46b6c984cf"
SRC_URI[sha256sum] = "874901a15bf24c11822bb67987aa4ccdb7d491c1e663781def6eb0be39b27d1d"
S = "${WORKDIR}/ros2_object_analytics-release-release-dashing-object_analytics_rviz-0.5.4-2"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros2-object-analytics', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ros2-object-analytics', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros2-object-analytics/ros2-object-analytics_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros2-object-analytics/ros2-object-analytics-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros2-object-analytics/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros2-object-analytics/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
