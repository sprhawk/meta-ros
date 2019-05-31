# Copyright (c) 2008-2019 LG Electronics, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# Value for DISTRO
Distribution = "webos"

# Supported MACHINE-s
Machines = ['raspberrypi3','qemux86']

# webos_layers = [
# ('layer-name', priority, 'URL', 'submission', 'working-dir'),
# ...
# ]
# Note that the github.com/openembedded repositories are read-only mirrors of
# the authoritative repositories on git.openembedded.org .
webos_layers = [
('bitbake',                   -1, 'git://github.com/openembedded/bitbake.git',              'branch=1.32,commit=0193e1f', ''),

('meta',                       5, 'git://github.com/openembedded/openembedded-core.git',    'branch=morty,commit=4b32784', 'oe-core'),

('meta-oe',                   10, 'git://github.com/openembedded/meta-openembedded.git',    'branch=morty,commit=997caf9', 'meta-oe'),
('meta-multimedia',           11, 'git://github.com/openembedded/meta-openembedded.git',    '', 'meta-oe'),
('meta-networking',           12, 'git://github.com/openembedded/meta-openembedded.git',    '', 'meta-oe'),
('meta-python',               13, 'git://github.com/openembedded/meta-openembedded.git',    '', 'meta-oe'),
('meta-filesystems',          14, 'git://github.com/openembedded/meta-openembedded.git',    '', 'meta-oe'),

('meta-qt5',                  20, 'git://github.com/meta-qt5/meta-qt5.git',                 'branch=krogoth,commit=dcfcb58', ''),

('meta-webos-backports-2.3',  30, 'git://github.com/webosose/meta-webosose.git',            '', ''),
('meta-webos-backports-2.4',  31, 'git://github.com/webosose/meta-webosose.git',            '', ''),
('meta-webos-backports-2.5',  32, 'git://github.com/webosose/meta-webosose.git',            '', ''),
('meta-webos-backports-2.6',  33, 'git://github.com/webosose/meta-webosose.git',            '', ''),

('meta-ros2',                 38, 'git://github.com/lgsvl/meta-ros2.git',                   'branch=ros2pr,commit=b92ab96',''),
('meta-webos',                40, 'git://github.com/webosose/meta-webosose.git',            'branch=master,commit=288cff4', ''),

('meta-raspberrypi',          50, 'git://git.yoctoproject.org/meta-raspberrypi',            'branch=morty,commit=2a19226', ''),
('meta-webos-raspberrypi',    51, 'git://github.com/webosose/meta-webosose.git',            '', ''),

('meta-webos-ros2',           52, 'git://github.com/webosose/meta-webosose.git',            '', ''),
]