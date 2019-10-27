require pcl.inc

SRC_URI[md5sum] = "436704215670bb869ca742af48c749a9"
SRC_URI[sha256sum] = "5a102a2fbe2ba77c775bf92c4a5d2e3d8170be53a68c3a76cfc72434ff7b9783"

SRC_URI += "file://0001-Dereference-shared_ptr-fix-for-GCC8.patch \
            file://0001-remove-OpenGL-required-for-GLES.patch \
           "


