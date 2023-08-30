# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SnapshotCopyGrantArgs', 'SnapshotCopyGrant']

@pulumi.input_type
class SnapshotCopyGrantArgs:
    def __init__(__self__, *,
                 snapshot_copy_grant_name: pulumi.Input[str],
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a SnapshotCopyGrant resource.
        :param pulumi.Input[str] snapshot_copy_grant_name: A friendly name for identifying the grant.
        :param pulumi.Input[str] kms_key_id: The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "snapshot_copy_grant_name", snapshot_copy_grant_name)
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="snapshotCopyGrantName")
    def snapshot_copy_grant_name(self) -> pulumi.Input[str]:
        """
        A friendly name for identifying the grant.
        """
        return pulumi.get(self, "snapshot_copy_grant_name")

    @snapshot_copy_grant_name.setter
    def snapshot_copy_grant_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "snapshot_copy_grant_name", value)

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
        """
        return pulumi.get(self, "kms_key_id")

    @kms_key_id.setter
    def kms_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _SnapshotCopyGrantState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 snapshot_copy_grant_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering SnapshotCopyGrant resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of snapshot copy grant
        :param pulumi.Input[str] kms_key_id: The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
        :param pulumi.Input[str] snapshot_copy_grant_name: A friendly name for identifying the grant.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)
        if snapshot_copy_grant_name is not None:
            pulumi.set(__self__, "snapshot_copy_grant_name", snapshot_copy_grant_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of snapshot copy grant
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
        """
        return pulumi.get(self, "kms_key_id")

    @kms_key_id.setter
    def kms_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_id", value)

    @property
    @pulumi.getter(name="snapshotCopyGrantName")
    def snapshot_copy_grant_name(self) -> Optional[pulumi.Input[str]]:
        """
        A friendly name for identifying the grant.
        """
        return pulumi.get(self, "snapshot_copy_grant_name")

    @snapshot_copy_grant_name.setter
    def snapshot_copy_grant_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snapshot_copy_grant_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class SnapshotCopyGrant(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 snapshot_copy_grant_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Creates a snapshot copy grant that allows AWS Redshift to encrypt copied snapshots with a customer master key from AWS KMS in a destination region.

        Note that the grant must exist in the destination region, and not in the region of the cluster.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test_snapshot_copy_grant = aws.redshift.SnapshotCopyGrant("testSnapshotCopyGrant", snapshot_copy_grant_name="my-grant")
        test_cluster = aws.redshift.Cluster("testCluster", snapshot_copy=aws.redshift.ClusterSnapshotCopyArgs(
            destination_region="us-east-2",
            grant_name=test_snapshot_copy_grant.snapshot_copy_grant_name,
        ))
        ```

        ## Import

        Using `pulumi import`, import Redshift Snapshot Copy Grants by name. For example:

        ```sh
         $ pulumi import aws:redshift/snapshotCopyGrant:SnapshotCopyGrant test my-grant
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] kms_key_id: The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
        :param pulumi.Input[str] snapshot_copy_grant_name: A friendly name for identifying the grant.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SnapshotCopyGrantArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a snapshot copy grant that allows AWS Redshift to encrypt copied snapshots with a customer master key from AWS KMS in a destination region.

        Note that the grant must exist in the destination region, and not in the region of the cluster.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test_snapshot_copy_grant = aws.redshift.SnapshotCopyGrant("testSnapshotCopyGrant", snapshot_copy_grant_name="my-grant")
        test_cluster = aws.redshift.Cluster("testCluster", snapshot_copy=aws.redshift.ClusterSnapshotCopyArgs(
            destination_region="us-east-2",
            grant_name=test_snapshot_copy_grant.snapshot_copy_grant_name,
        ))
        ```

        ## Import

        Using `pulumi import`, import Redshift Snapshot Copy Grants by name. For example:

        ```sh
         $ pulumi import aws:redshift/snapshotCopyGrant:SnapshotCopyGrant test my-grant
        ```

        :param str resource_name: The name of the resource.
        :param SnapshotCopyGrantArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SnapshotCopyGrantArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 snapshot_copy_grant_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SnapshotCopyGrantArgs.__new__(SnapshotCopyGrantArgs)

            __props__.__dict__["kms_key_id"] = kms_key_id
            if snapshot_copy_grant_name is None and not opts.urn:
                raise TypeError("Missing required property 'snapshot_copy_grant_name'")
            __props__.__dict__["snapshot_copy_grant_name"] = snapshot_copy_grant_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(SnapshotCopyGrant, __self__).__init__(
            'aws:redshift/snapshotCopyGrant:SnapshotCopyGrant',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            kms_key_id: Optional[pulumi.Input[str]] = None,
            snapshot_copy_grant_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'SnapshotCopyGrant':
        """
        Get an existing SnapshotCopyGrant resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of snapshot copy grant
        :param pulumi.Input[str] kms_key_id: The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
        :param pulumi.Input[str] snapshot_copy_grant_name: A friendly name for identifying the grant.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SnapshotCopyGrantState.__new__(_SnapshotCopyGrantState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["kms_key_id"] = kms_key_id
        __props__.__dict__["snapshot_copy_grant_name"] = snapshot_copy_grant_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return SnapshotCopyGrant(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of snapshot copy grant
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> pulumi.Output[str]:
        """
        The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
        """
        return pulumi.get(self, "kms_key_id")

    @property
    @pulumi.getter(name="snapshotCopyGrantName")
    def snapshot_copy_grant_name(self) -> pulumi.Output[str]:
        """
        A friendly name for identifying the grant.
        """
        return pulumi.get(self, "snapshot_copy_grant_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

