# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = [
    'FastSnapshotRestoreTimeoutsArgs',
    'FastSnapshotRestoreTimeoutsArgsDict',
    'SnapshotImportClientDataArgs',
    'SnapshotImportClientDataArgsDict',
    'SnapshotImportDiskContainerArgs',
    'SnapshotImportDiskContainerArgsDict',
    'SnapshotImportDiskContainerUserBucketArgs',
    'SnapshotImportDiskContainerUserBucketArgsDict',
    'GetEbsVolumesFilterArgs',
    'GetEbsVolumesFilterArgsDict',
    'GetSnapshotFilterArgs',
    'GetSnapshotFilterArgsDict',
    'GetSnapshotIdsFilterArgs',
    'GetSnapshotIdsFilterArgsDict',
    'GetVolumeFilterArgs',
    'GetVolumeFilterArgsDict',
]

MYPY = False

if not MYPY:
    class FastSnapshotRestoreTimeoutsArgsDict(TypedDict):
        create: NotRequired[pulumi.Input[str]]
        """
        A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
        """
        delete: NotRequired[pulumi.Input[str]]
        """
        A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
        """
elif False:
    FastSnapshotRestoreTimeoutsArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class FastSnapshotRestoreTimeoutsArgs:
    def __init__(__self__, *,
                 create: Optional[pulumi.Input[str]] = None,
                 delete: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] create: A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
        :param pulumi.Input[str] delete: A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
        """
        if create is not None:
            pulumi.set(__self__, "create", create)
        if delete is not None:
            pulumi.set(__self__, "delete", delete)

    @property
    @pulumi.getter
    def create(self) -> Optional[pulumi.Input[str]]:
        """
        A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
        """
        return pulumi.get(self, "create")

    @create.setter
    def create(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create", value)

    @property
    @pulumi.getter
    def delete(self) -> Optional[pulumi.Input[str]]:
        """
        A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
        """
        return pulumi.get(self, "delete")

    @delete.setter
    def delete(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delete", value)


if not MYPY:
    class SnapshotImportClientDataArgsDict(TypedDict):
        comment: NotRequired[pulumi.Input[str]]
        """
        A user-defined comment about the disk upload.
        """
        upload_end: NotRequired[pulumi.Input[str]]
        """
        The time that the disk upload ends.
        """
        upload_size: NotRequired[pulumi.Input[float]]
        """
        The size of the uploaded disk image, in GiB.
        """
        upload_start: NotRequired[pulumi.Input[str]]
        """
        The time that the disk upload starts.
        """
elif False:
    SnapshotImportClientDataArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class SnapshotImportClientDataArgs:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 upload_end: Optional[pulumi.Input[str]] = None,
                 upload_size: Optional[pulumi.Input[float]] = None,
                 upload_start: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] comment: A user-defined comment about the disk upload.
        :param pulumi.Input[str] upload_end: The time that the disk upload ends.
        :param pulumi.Input[float] upload_size: The size of the uploaded disk image, in GiB.
        :param pulumi.Input[str] upload_start: The time that the disk upload starts.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if upload_end is not None:
            pulumi.set(__self__, "upload_end", upload_end)
        if upload_size is not None:
            pulumi.set(__self__, "upload_size", upload_size)
        if upload_start is not None:
            pulumi.set(__self__, "upload_start", upload_start)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        A user-defined comment about the disk upload.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="uploadEnd")
    def upload_end(self) -> Optional[pulumi.Input[str]]:
        """
        The time that the disk upload ends.
        """
        return pulumi.get(self, "upload_end")

    @upload_end.setter
    def upload_end(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "upload_end", value)

    @property
    @pulumi.getter(name="uploadSize")
    def upload_size(self) -> Optional[pulumi.Input[float]]:
        """
        The size of the uploaded disk image, in GiB.
        """
        return pulumi.get(self, "upload_size")

    @upload_size.setter
    def upload_size(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "upload_size", value)

    @property
    @pulumi.getter(name="uploadStart")
    def upload_start(self) -> Optional[pulumi.Input[str]]:
        """
        The time that the disk upload starts.
        """
        return pulumi.get(self, "upload_start")

    @upload_start.setter
    def upload_start(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "upload_start", value)


if not MYPY:
    class SnapshotImportDiskContainerArgsDict(TypedDict):
        format: pulumi.Input[str]
        """
        The format of the disk image being imported. One of `VHD` or `VMDK`.
        """
        description: NotRequired[pulumi.Input[str]]
        """
        The description of the disk image being imported.
        """
        url: NotRequired[pulumi.Input[str]]
        """
        The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..). One of `url` or `user_bucket` must be set.
        """
        user_bucket: NotRequired[pulumi.Input['SnapshotImportDiskContainerUserBucketArgsDict']]
        """
        The Amazon S3 bucket for the disk image. One of `url` or `user_bucket` must be set. Detailed below.
        """
elif False:
    SnapshotImportDiskContainerArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class SnapshotImportDiskContainerArgs:
    def __init__(__self__, *,
                 format: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 user_bucket: Optional[pulumi.Input['SnapshotImportDiskContainerUserBucketArgs']] = None):
        """
        :param pulumi.Input[str] format: The format of the disk image being imported. One of `VHD` or `VMDK`.
        :param pulumi.Input[str] description: The description of the disk image being imported.
        :param pulumi.Input[str] url: The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..). One of `url` or `user_bucket` must be set.
        :param pulumi.Input['SnapshotImportDiskContainerUserBucketArgs'] user_bucket: The Amazon S3 bucket for the disk image. One of `url` or `user_bucket` must be set. Detailed below.
        """
        pulumi.set(__self__, "format", format)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if url is not None:
            pulumi.set(__self__, "url", url)
        if user_bucket is not None:
            pulumi.set(__self__, "user_bucket", user_bucket)

    @property
    @pulumi.getter
    def format(self) -> pulumi.Input[str]:
        """
        The format of the disk image being imported. One of `VHD` or `VMDK`.
        """
        return pulumi.get(self, "format")

    @format.setter
    def format(self, value: pulumi.Input[str]):
        pulumi.set(self, "format", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the disk image being imported.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..). One of `url` or `user_bucket` must be set.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter(name="userBucket")
    def user_bucket(self) -> Optional[pulumi.Input['SnapshotImportDiskContainerUserBucketArgs']]:
        """
        The Amazon S3 bucket for the disk image. One of `url` or `user_bucket` must be set. Detailed below.
        """
        return pulumi.get(self, "user_bucket")

    @user_bucket.setter
    def user_bucket(self, value: Optional[pulumi.Input['SnapshotImportDiskContainerUserBucketArgs']]):
        pulumi.set(self, "user_bucket", value)


if not MYPY:
    class SnapshotImportDiskContainerUserBucketArgsDict(TypedDict):
        s3_bucket: pulumi.Input[str]
        """
        The name of the Amazon S3 bucket where the disk image is located.
        """
        s3_key: pulumi.Input[str]
        """
        The file name of the disk image.
        """
elif False:
    SnapshotImportDiskContainerUserBucketArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class SnapshotImportDiskContainerUserBucketArgs:
    def __init__(__self__, *,
                 s3_bucket: pulumi.Input[str],
                 s3_key: pulumi.Input[str]):
        """
        :param pulumi.Input[str] s3_bucket: The name of the Amazon S3 bucket where the disk image is located.
        :param pulumi.Input[str] s3_key: The file name of the disk image.
        """
        pulumi.set(__self__, "s3_bucket", s3_bucket)
        pulumi.set(__self__, "s3_key", s3_key)

    @property
    @pulumi.getter(name="s3Bucket")
    def s3_bucket(self) -> pulumi.Input[str]:
        """
        The name of the Amazon S3 bucket where the disk image is located.
        """
        return pulumi.get(self, "s3_bucket")

    @s3_bucket.setter
    def s3_bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "s3_bucket", value)

    @property
    @pulumi.getter(name="s3Key")
    def s3_key(self) -> pulumi.Input[str]:
        """
        The file name of the disk image.
        """
        return pulumi.get(self, "s3_key")

    @s3_key.setter
    def s3_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "s3_key", value)


if not MYPY:
    class GetEbsVolumesFilterArgsDict(TypedDict):
        name: str
        """
        Name of the field to filter by, as defined by
        [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumes.html).
        For example, if matching against the `size` filter, use:

        ```python
        import pulumi
        import pulumi_aws as aws

        ten_or_twenty_gb_volumes = aws.ebs.get_ebs_volumes(filters=[{
            "name": "size",
            "values": [
                "10",
                "20",
            ],
        }])
        ```
        """
        values: Sequence[str]
        """
        Set of values that are accepted for the given field.
        EBS Volume IDs will be selected if any one of the given values match.
        """
elif False:
    GetEbsVolumesFilterArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetEbsVolumesFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        """
        :param str name: Name of the field to filter by, as defined by
               [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumes.html).
               For example, if matching against the `size` filter, use:
               
               ```python
               import pulumi
               import pulumi_aws as aws
               
               ten_or_twenty_gb_volumes = aws.ebs.get_ebs_volumes(filters=[{
                   "name": "size",
                   "values": [
                       "10",
                       "20",
                   ],
               }])
               ```
        :param Sequence[str] values: Set of values that are accepted for the given field.
               EBS Volume IDs will be selected if any one of the given values match.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the field to filter by, as defined by
        [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumes.html).
        For example, if matching against the `size` filter, use:

        ```python
        import pulumi
        import pulumi_aws as aws

        ten_or_twenty_gb_volumes = aws.ebs.get_ebs_volumes(filters=[{
            "name": "size",
            "values": [
                "10",
                "20",
            ],
        }])
        ```
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        Set of values that are accepted for the given field.
        EBS Volume IDs will be selected if any one of the given values match.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


if not MYPY:
    class GetSnapshotFilterArgsDict(TypedDict):
        name: str
        values: Sequence[str]
elif False:
    GetSnapshotFilterArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetSnapshotFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


if not MYPY:
    class GetSnapshotIdsFilterArgsDict(TypedDict):
        name: str
        values: Sequence[str]
elif False:
    GetSnapshotIdsFilterArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetSnapshotIdsFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


if not MYPY:
    class GetVolumeFilterArgsDict(TypedDict):
        name: str
        values: Sequence[str]
elif False:
    GetVolumeFilterArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetVolumeFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


