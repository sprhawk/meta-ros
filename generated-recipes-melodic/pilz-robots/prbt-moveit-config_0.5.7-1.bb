# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "An automatically generated package with all the configuration and launch files for using the prbt with the MoveIt! Motion Planning Framework"
AUTHOR = "Alexander Gutenkunst <a.gutenkunst@pilz.de>"
HOMEPAGE = "https://wiki.ros.org/prbt_moveit_config"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "pilz_robots"
ROS_BPN = "prbt_moveit_config"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-state-publisher \
    moveit-fake-controller-manager \
    moveit-kinematics \
    moveit-planners-ompl \
    moveit-ros-move-group \
    moveit-ros-visualization \
    moveit-simple-controller-manager \
    prbt-ikfast-manipulator-plugin \
    prbt-support \
    robot-state-publisher \
    rviz \
    xacro \
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

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_moveit_config/0.5.7-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2f67ec6040b218bc0b61b0114a4fb76f"
SRC_URI[sha256sum] = "d991929642374ddfefc7775316c52e1874e52c082a89d5c22db985907e9f6964"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_moveit_config-0.5.7-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pilz-robots', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pilz-robots', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-robots/pilz-robots_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-robots/pilz-robots-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-robots/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-robots/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}