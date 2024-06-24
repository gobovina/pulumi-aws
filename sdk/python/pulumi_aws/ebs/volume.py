# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VolumeArgs', 'Volume']

@pulumi.input_type
class VolumeArgs:
    def __init__(__self__, *,
                 availability_zone: pulumi.Input[str],
                 encrypted: Optional[pulumi.Input[bool]] = None,
                 final_snapshot: Optional[pulumi.Input[bool]] = None,
                 iops: Optional[pulumi.Input[int]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 multi_attach_enabled: Optional[pulumi.Input[bool]] = None,
                 outpost_arn: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 snapshot_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 throughput: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Volume resource.
        :param pulumi.Input[str] availability_zone: The AZ where the EBS volume will exist.
        :param pulumi.Input[bool] encrypted: If true, the disk will be encrypted.
        :param pulumi.Input[bool] final_snapshot: If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
        :param pulumi.Input[int] iops: The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
        :param pulumi.Input[str] kms_key_id: The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
        :param pulumi.Input[bool] multi_attach_enabled: Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
        :param pulumi.Input[str] outpost_arn: The Amazon Resource Name (ARN) of the Outpost.
        :param pulumi.Input[int] size: The size of the drive in GiBs.
        :param pulumi.Input[str] snapshot_id: A snapshot to base the EBS volume off of.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[int] throughput: The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.
               
               > **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
        :param pulumi.Input[str] type: The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
        """
        pulumi.set(__self__, "availability_zone", availability_zone)
        if encrypted is not None:
            pulumi.set(__self__, "encrypted", encrypted)
        if final_snapshot is not None:
            pulumi.set(__self__, "final_snapshot", final_snapshot)
        if iops is not None:
            pulumi.set(__self__, "iops", iops)
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)
        if multi_attach_enabled is not None:
            pulumi.set(__self__, "multi_attach_enabled", multi_attach_enabled)
        if outpost_arn is not None:
            pulumi.set(__self__, "outpost_arn", outpost_arn)
        if size is not None:
            pulumi.set(__self__, "size", size)
        if snapshot_id is not None:
            pulumi.set(__self__, "snapshot_id", snapshot_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if throughput is not None:
            pulumi.set(__self__, "throughput", throughput)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> pulumi.Input[str]:
        """
        The AZ where the EBS volume will exist.
        """
        return pulumi.get(self, "availability_zone")

    @availability_zone.setter
    def availability_zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "availability_zone", value)

    @property
    @pulumi.getter
    def encrypted(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the disk will be encrypted.
        """
        return pulumi.get(self, "encrypted")

    @encrypted.setter
    def encrypted(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "encrypted", value)

    @property
    @pulumi.getter(name="finalSnapshot")
    def final_snapshot(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
        """
        return pulumi.get(self, "final_snapshot")

    @final_snapshot.setter
    def final_snapshot(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "final_snapshot", value)

    @property
    @pulumi.getter
    def iops(self) -> Optional[pulumi.Input[int]]:
        """
        The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
        """
        return pulumi.get(self, "iops")

    @iops.setter
    def iops(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "iops", value)

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
        """
        return pulumi.get(self, "kms_key_id")

    @kms_key_id.setter
    def kms_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_id", value)

    @property
    @pulumi.getter(name="multiAttachEnabled")
    def multi_attach_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
        """
        return pulumi.get(self, "multi_attach_enabled")

    @multi_attach_enabled.setter
    def multi_attach_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "multi_attach_enabled", value)

    @property
    @pulumi.getter(name="outpostArn")
    def outpost_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the Outpost.
        """
        return pulumi.get(self, "outpost_arn")

    @outpost_arn.setter
    def outpost_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "outpost_arn", value)

    @property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[int]]:
        """
        The size of the drive in GiBs.
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "size", value)

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> Optional[pulumi.Input[str]]:
        """
        A snapshot to base the EBS volume off of.
        """
        return pulumi.get(self, "snapshot_id")

    @snapshot_id.setter
    def snapshot_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snapshot_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def throughput(self) -> Optional[pulumi.Input[int]]:
        """
        The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.

        > **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
        """
        return pulumi.get(self, "throughput")

    @throughput.setter
    def throughput(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "throughput", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _VolumeState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 availability_zone: Optional[pulumi.Input[str]] = None,
                 encrypted: Optional[pulumi.Input[bool]] = None,
                 final_snapshot: Optional[pulumi.Input[bool]] = None,
                 iops: Optional[pulumi.Input[int]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 multi_attach_enabled: Optional[pulumi.Input[bool]] = None,
                 outpost_arn: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 snapshot_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 throughput: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Volume resources.
        :param pulumi.Input[str] arn: The volume ARN (e.g., arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
        :param pulumi.Input[str] availability_zone: The AZ where the EBS volume will exist.
        :param pulumi.Input[bool] encrypted: If true, the disk will be encrypted.
        :param pulumi.Input[bool] final_snapshot: If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
        :param pulumi.Input[int] iops: The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
        :param pulumi.Input[str] kms_key_id: The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
        :param pulumi.Input[bool] multi_attach_enabled: Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
        :param pulumi.Input[str] outpost_arn: The Amazon Resource Name (ARN) of the Outpost.
        :param pulumi.Input[int] size: The size of the drive in GiBs.
        :param pulumi.Input[str] snapshot_id: A snapshot to base the EBS volume off of.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[int] throughput: The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.
               
               > **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
        :param pulumi.Input[str] type: The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if availability_zone is not None:
            pulumi.set(__self__, "availability_zone", availability_zone)
        if encrypted is not None:
            pulumi.set(__self__, "encrypted", encrypted)
        if final_snapshot is not None:
            pulumi.set(__self__, "final_snapshot", final_snapshot)
        if iops is not None:
            pulumi.set(__self__, "iops", iops)
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)
        if multi_attach_enabled is not None:
            pulumi.set(__self__, "multi_attach_enabled", multi_attach_enabled)
        if outpost_arn is not None:
            pulumi.set(__self__, "outpost_arn", outpost_arn)
        if size is not None:
            pulumi.set(__self__, "size", size)
        if snapshot_id is not None:
            pulumi.set(__self__, "snapshot_id", snapshot_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if throughput is not None:
            pulumi.set(__self__, "throughput", throughput)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The volume ARN (e.g., arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> Optional[pulumi.Input[str]]:
        """
        The AZ where the EBS volume will exist.
        """
        return pulumi.get(self, "availability_zone")

    @availability_zone.setter
    def availability_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "availability_zone", value)

    @property
    @pulumi.getter
    def encrypted(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the disk will be encrypted.
        """
        return pulumi.get(self, "encrypted")

    @encrypted.setter
    def encrypted(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "encrypted", value)

    @property
    @pulumi.getter(name="finalSnapshot")
    def final_snapshot(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
        """
        return pulumi.get(self, "final_snapshot")

    @final_snapshot.setter
    def final_snapshot(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "final_snapshot", value)

    @property
    @pulumi.getter
    def iops(self) -> Optional[pulumi.Input[int]]:
        """
        The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
        """
        return pulumi.get(self, "iops")

    @iops.setter
    def iops(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "iops", value)

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
        """
        return pulumi.get(self, "kms_key_id")

    @kms_key_id.setter
    def kms_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_id", value)

    @property
    @pulumi.getter(name="multiAttachEnabled")
    def multi_attach_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
        """
        return pulumi.get(self, "multi_attach_enabled")

    @multi_attach_enabled.setter
    def multi_attach_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "multi_attach_enabled", value)

    @property
    @pulumi.getter(name="outpostArn")
    def outpost_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the Outpost.
        """
        return pulumi.get(self, "outpost_arn")

    @outpost_arn.setter
    def outpost_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "outpost_arn", value)

    @property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[int]]:
        """
        The size of the drive in GiBs.
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "size", value)

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> Optional[pulumi.Input[str]]:
        """
        A snapshot to base the EBS volume off of.
        """
        return pulumi.get(self, "snapshot_id")

    @snapshot_id.setter
    def snapshot_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snapshot_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def throughput(self) -> Optional[pulumi.Input[int]]:
        """
        The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.

        > **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
        """
        return pulumi.get(self, "throughput")

    @throughput.setter
    def throughput(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "throughput", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class Volume(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 availability_zone: Optional[pulumi.Input[str]] = None,
                 encrypted: Optional[pulumi.Input[bool]] = None,
                 final_snapshot: Optional[pulumi.Input[bool]] = None,
                 iops: Optional[pulumi.Input[int]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 multi_attach_enabled: Optional[pulumi.Input[bool]] = None,
                 outpost_arn: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 snapshot_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 throughput: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a single EBS volume.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ebs.Volume("example",
            availability_zone="us-west-2a",
            size=40,
            tags={
                "Name": "HelloWorld",
            })
        ```

        > **NOTE:** At least one of `size` or `snapshot_id` is required when specifying an EBS volume

        ## Import

        Using `pulumi import`, import EBS Volumes using the `id`. For example:

        ```sh
        $ pulumi import aws:ebs/volume:Volume id vol-049df61146c4d7901
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] availability_zone: The AZ where the EBS volume will exist.
        :param pulumi.Input[bool] encrypted: If true, the disk will be encrypted.
        :param pulumi.Input[bool] final_snapshot: If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
        :param pulumi.Input[int] iops: The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
        :param pulumi.Input[str] kms_key_id: The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
        :param pulumi.Input[bool] multi_attach_enabled: Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
        :param pulumi.Input[str] outpost_arn: The Amazon Resource Name (ARN) of the Outpost.
        :param pulumi.Input[int] size: The size of the drive in GiBs.
        :param pulumi.Input[str] snapshot_id: A snapshot to base the EBS volume off of.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[int] throughput: The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.
               
               > **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
        :param pulumi.Input[str] type: The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VolumeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a single EBS volume.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ebs.Volume("example",
            availability_zone="us-west-2a",
            size=40,
            tags={
                "Name": "HelloWorld",
            })
        ```

        > **NOTE:** At least one of `size` or `snapshot_id` is required when specifying an EBS volume

        ## Import

        Using `pulumi import`, import EBS Volumes using the `id`. For example:

        ```sh
        $ pulumi import aws:ebs/volume:Volume id vol-049df61146c4d7901
        ```

        :param str resource_name: The name of the resource.
        :param VolumeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VolumeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 availability_zone: Optional[pulumi.Input[str]] = None,
                 encrypted: Optional[pulumi.Input[bool]] = None,
                 final_snapshot: Optional[pulumi.Input[bool]] = None,
                 iops: Optional[pulumi.Input[int]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 multi_attach_enabled: Optional[pulumi.Input[bool]] = None,
                 outpost_arn: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 snapshot_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 throughput: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VolumeArgs.__new__(VolumeArgs)

            if availability_zone is None and not opts.urn:
                raise TypeError("Missing required property 'availability_zone'")
            __props__.__dict__["availability_zone"] = availability_zone
            __props__.__dict__["encrypted"] = encrypted
            __props__.__dict__["final_snapshot"] = final_snapshot
            __props__.__dict__["iops"] = iops
            __props__.__dict__["kms_key_id"] = kms_key_id
            __props__.__dict__["multi_attach_enabled"] = multi_attach_enabled
            __props__.__dict__["outpost_arn"] = outpost_arn
            __props__.__dict__["size"] = size
            __props__.__dict__["snapshot_id"] = snapshot_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["throughput"] = throughput
            __props__.__dict__["type"] = type
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(Volume, __self__).__init__(
            'aws:ebs/volume:Volume',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            availability_zone: Optional[pulumi.Input[str]] = None,
            encrypted: Optional[pulumi.Input[bool]] = None,
            final_snapshot: Optional[pulumi.Input[bool]] = None,
            iops: Optional[pulumi.Input[int]] = None,
            kms_key_id: Optional[pulumi.Input[str]] = None,
            multi_attach_enabled: Optional[pulumi.Input[bool]] = None,
            outpost_arn: Optional[pulumi.Input[str]] = None,
            size: Optional[pulumi.Input[int]] = None,
            snapshot_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            throughput: Optional[pulumi.Input[int]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'Volume':
        """
        Get an existing Volume resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The volume ARN (e.g., arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
        :param pulumi.Input[str] availability_zone: The AZ where the EBS volume will exist.
        :param pulumi.Input[bool] encrypted: If true, the disk will be encrypted.
        :param pulumi.Input[bool] final_snapshot: If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
        :param pulumi.Input[int] iops: The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
        :param pulumi.Input[str] kms_key_id: The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
        :param pulumi.Input[bool] multi_attach_enabled: Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
        :param pulumi.Input[str] outpost_arn: The Amazon Resource Name (ARN) of the Outpost.
        :param pulumi.Input[int] size: The size of the drive in GiBs.
        :param pulumi.Input[str] snapshot_id: A snapshot to base the EBS volume off of.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[int] throughput: The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.
               
               > **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
        :param pulumi.Input[str] type: The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VolumeState.__new__(_VolumeState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["availability_zone"] = availability_zone
        __props__.__dict__["encrypted"] = encrypted
        __props__.__dict__["final_snapshot"] = final_snapshot
        __props__.__dict__["iops"] = iops
        __props__.__dict__["kms_key_id"] = kms_key_id
        __props__.__dict__["multi_attach_enabled"] = multi_attach_enabled
        __props__.__dict__["outpost_arn"] = outpost_arn
        __props__.__dict__["size"] = size
        __props__.__dict__["snapshot_id"] = snapshot_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["throughput"] = throughput
        __props__.__dict__["type"] = type
        return Volume(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The volume ARN (e.g., arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> pulumi.Output[str]:
        """
        The AZ where the EBS volume will exist.
        """
        return pulumi.get(self, "availability_zone")

    @property
    @pulumi.getter
    def encrypted(self) -> pulumi.Output[bool]:
        """
        If true, the disk will be encrypted.
        """
        return pulumi.get(self, "encrypted")

    @property
    @pulumi.getter(name="finalSnapshot")
    def final_snapshot(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
        """
        return pulumi.get(self, "final_snapshot")

    @property
    @pulumi.getter
    def iops(self) -> pulumi.Output[int]:
        """
        The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
        """
        return pulumi.get(self, "iops")

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> pulumi.Output[str]:
        """
        The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
        """
        return pulumi.get(self, "kms_key_id")

    @property
    @pulumi.getter(name="multiAttachEnabled")
    def multi_attach_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
        """
        return pulumi.get(self, "multi_attach_enabled")

    @property
    @pulumi.getter(name="outpostArn")
    def outpost_arn(self) -> pulumi.Output[Optional[str]]:
        """
        The Amazon Resource Name (ARN) of the Outpost.
        """
        return pulumi.get(self, "outpost_arn")

    @property
    @pulumi.getter
    def size(self) -> pulumi.Output[int]:
        """
        The size of the drive in GiBs.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> pulumi.Output[str]:
        """
        A snapshot to base the EBS volume off of.
        """
        return pulumi.get(self, "snapshot_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def throughput(self) -> pulumi.Output[int]:
        """
        The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.

        > **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
        """
        return pulumi.get(self, "throughput")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
        """
        return pulumi.get(self, "type")

