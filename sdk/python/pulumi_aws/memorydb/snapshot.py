# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['SnapshotArgs', 'Snapshot']

@pulumi.input_type
class SnapshotArgs:
    def __init__(__self__, *,
                 cluster_name: pulumi.Input[str],
                 kms_key_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Snapshot resource.
        :param pulumi.Input[str] cluster_name: Name of the MemoryDB cluster to take a snapshot of.
        :param pulumi.Input[str] kms_key_arn: ARN of the KMS key used to encrypt the snapshot at rest.
        :param pulumi.Input[str] name: Name of the snapshot. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "cluster_name", cluster_name)
        if kms_key_arn is not None:
            pulumi.set(__self__, "kms_key_arn", kms_key_arn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Input[str]:
        """
        Name of the MemoryDB cluster to take a snapshot of.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the KMS key used to encrypt the snapshot at rest.
        """
        return pulumi.get(self, "kms_key_arn")

    @kms_key_arn.setter
    def kms_key_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the snapshot. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        """
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

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


@pulumi.input_type
class _SnapshotState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 cluster_configurations: Optional[pulumi.Input[Sequence[pulumi.Input['SnapshotClusterConfigurationArgs']]]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 kms_key_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Snapshot resources.
        :param pulumi.Input[str] arn: The ARN of the snapshot.
        :param pulumi.Input[Sequence[pulumi.Input['SnapshotClusterConfigurationArgs']]] cluster_configurations: The configuration of the cluster from which the snapshot was taken.
        :param pulumi.Input[str] cluster_name: Name of the MemoryDB cluster to take a snapshot of.
        :param pulumi.Input[str] kms_key_arn: ARN of the KMS key used to encrypt the snapshot at rest.
        :param pulumi.Input[str] name: Name of the snapshot. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        :param pulumi.Input[str] source: Indicates whether the snapshot is from an automatic backup (`automated`) or was created manually (`manual`).
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if cluster_configurations is not None:
            pulumi.set(__self__, "cluster_configurations", cluster_configurations)
        if cluster_name is not None:
            pulumi.set(__self__, "cluster_name", cluster_name)
        if kms_key_arn is not None:
            pulumi.set(__self__, "kms_key_arn", kms_key_arn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the snapshot.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="clusterConfigurations")
    def cluster_configurations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SnapshotClusterConfigurationArgs']]]]:
        """
        The configuration of the cluster from which the snapshot was taken.
        """
        return pulumi.get(self, "cluster_configurations")

    @cluster_configurations.setter
    def cluster_configurations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SnapshotClusterConfigurationArgs']]]]):
        pulumi.set(self, "cluster_configurations", value)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the MemoryDB cluster to take a snapshot of.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the KMS key used to encrypt the snapshot at rest.
        """
        return pulumi.get(self, "kms_key_arn")

    @kms_key_arn.setter
    def kms_key_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the snapshot. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        """
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether the snapshot is from an automatic backup (`automated`) or was created manually (`manual`).
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source", value)

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
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class Snapshot(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 kms_key_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a MemoryDB Snapshot.

        More information about snapshot and restore can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/snapshots.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.memorydb.Snapshot("example", cluster_name=aws_memorydb_cluster["example"]["name"])
        ```

        ## Import

        Using `pulumi import`, import a snapshot using the `name`. For example:

        ```sh
         $ pulumi import aws:memorydb/snapshot:Snapshot example my-snapshot
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_name: Name of the MemoryDB cluster to take a snapshot of.
        :param pulumi.Input[str] kms_key_arn: ARN of the KMS key used to encrypt the snapshot at rest.
        :param pulumi.Input[str] name: Name of the snapshot. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SnapshotArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a MemoryDB Snapshot.

        More information about snapshot and restore can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/snapshots.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.memorydb.Snapshot("example", cluster_name=aws_memorydb_cluster["example"]["name"])
        ```

        ## Import

        Using `pulumi import`, import a snapshot using the `name`. For example:

        ```sh
         $ pulumi import aws:memorydb/snapshot:Snapshot example my-snapshot
        ```

        :param str resource_name: The name of the resource.
        :param SnapshotArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SnapshotArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 kms_key_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SnapshotArgs.__new__(SnapshotArgs)

            if cluster_name is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_name'")
            __props__.__dict__["cluster_name"] = cluster_name
            __props__.__dict__["kms_key_arn"] = kms_key_arn
            __props__.__dict__["name"] = name
            __props__.__dict__["name_prefix"] = name_prefix
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["cluster_configurations"] = None
            __props__.__dict__["source"] = None
            __props__.__dict__["tags_all"] = None
        super(Snapshot, __self__).__init__(
            'aws:memorydb/snapshot:Snapshot',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            cluster_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SnapshotClusterConfigurationArgs']]]]] = None,
            cluster_name: Optional[pulumi.Input[str]] = None,
            kms_key_arn: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            name_prefix: Optional[pulumi.Input[str]] = None,
            source: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Snapshot':
        """
        Get an existing Snapshot resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the snapshot.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SnapshotClusterConfigurationArgs']]]] cluster_configurations: The configuration of the cluster from which the snapshot was taken.
        :param pulumi.Input[str] cluster_name: Name of the MemoryDB cluster to take a snapshot of.
        :param pulumi.Input[str] kms_key_arn: ARN of the KMS key used to encrypt the snapshot at rest.
        :param pulumi.Input[str] name: Name of the snapshot. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        :param pulumi.Input[str] source: Indicates whether the snapshot is from an automatic backup (`automated`) or was created manually (`manual`).
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SnapshotState.__new__(_SnapshotState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["cluster_configurations"] = cluster_configurations
        __props__.__dict__["cluster_name"] = cluster_name
        __props__.__dict__["kms_key_arn"] = kms_key_arn
        __props__.__dict__["name"] = name
        __props__.__dict__["name_prefix"] = name_prefix
        __props__.__dict__["source"] = source
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Snapshot(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the snapshot.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="clusterConfigurations")
    def cluster_configurations(self) -> pulumi.Output[Sequence['outputs.SnapshotClusterConfiguration']]:
        """
        The configuration of the cluster from which the snapshot was taken.
        """
        return pulumi.get(self, "cluster_configurations")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Output[str]:
        """
        Name of the MemoryDB cluster to take a snapshot of.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> pulumi.Output[Optional[str]]:
        """
        ARN of the KMS key used to encrypt the snapshot at rest.
        """
        return pulumi.get(self, "kms_key_arn")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the snapshot. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> pulumi.Output[str]:
        """
        Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        """
        return pulumi.get(self, "name_prefix")

    @property
    @pulumi.getter
    def source(self) -> pulumi.Output[str]:
        """
        Indicates whether the snapshot is from an automatic backup (`automated`) or was created manually (`manual`).
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

