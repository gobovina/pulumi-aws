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

__all__ = ['GlobalClusterArgs', 'GlobalCluster']

@pulumi.input_type
class GlobalClusterArgs:
    def __init__(__self__, *,
                 global_cluster_identifier: pulumi.Input[str],
                 deletion_protection: Optional[pulumi.Input[bool]] = None,
                 engine: Optional[pulumi.Input[str]] = None,
                 engine_version: Optional[pulumi.Input[str]] = None,
                 source_db_cluster_identifier: Optional[pulumi.Input[str]] = None,
                 storage_encrypted: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a GlobalCluster resource.
        :param pulumi.Input[str] global_cluster_identifier: The global cluster identifier.
        :param pulumi.Input[bool] deletion_protection: If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
        :param pulumi.Input[str] engine: Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Current Valid values: `neptune`. Conflicts with `source_db_cluster_identifier`.
        :param pulumi.Input[str] engine_version: Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
               * **NOTE:** Upgrading major versions is not supported.
        :param pulumi.Input[str] source_db_cluster_identifier: Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
        :param pulumi.Input[bool] storage_encrypted: Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
        """
        pulumi.set(__self__, "global_cluster_identifier", global_cluster_identifier)
        if deletion_protection is not None:
            pulumi.set(__self__, "deletion_protection", deletion_protection)
        if engine is not None:
            pulumi.set(__self__, "engine", engine)
        if engine_version is not None:
            pulumi.set(__self__, "engine_version", engine_version)
        if source_db_cluster_identifier is not None:
            pulumi.set(__self__, "source_db_cluster_identifier", source_db_cluster_identifier)
        if storage_encrypted is not None:
            pulumi.set(__self__, "storage_encrypted", storage_encrypted)

    @property
    @pulumi.getter(name="globalClusterIdentifier")
    def global_cluster_identifier(self) -> pulumi.Input[str]:
        """
        The global cluster identifier.
        """
        return pulumi.get(self, "global_cluster_identifier")

    @global_cluster_identifier.setter
    def global_cluster_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "global_cluster_identifier", value)

    @property
    @pulumi.getter(name="deletionProtection")
    def deletion_protection(self) -> Optional[pulumi.Input[bool]]:
        """
        If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
        """
        return pulumi.get(self, "deletion_protection")

    @deletion_protection.setter
    def deletion_protection(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deletion_protection", value)

    @property
    @pulumi.getter
    def engine(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Current Valid values: `neptune`. Conflicts with `source_db_cluster_identifier`.
        """
        return pulumi.get(self, "engine")

    @engine.setter
    def engine(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "engine", value)

    @property
    @pulumi.getter(name="engineVersion")
    def engine_version(self) -> Optional[pulumi.Input[str]]:
        """
        Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
        * **NOTE:** Upgrading major versions is not supported.
        """
        return pulumi.get(self, "engine_version")

    @engine_version.setter
    def engine_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "engine_version", value)

    @property
    @pulumi.getter(name="sourceDbClusterIdentifier")
    def source_db_cluster_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
        """
        return pulumi.get(self, "source_db_cluster_identifier")

    @source_db_cluster_identifier.setter
    def source_db_cluster_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_db_cluster_identifier", value)

    @property
    @pulumi.getter(name="storageEncrypted")
    def storage_encrypted(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
        """
        return pulumi.get(self, "storage_encrypted")

    @storage_encrypted.setter
    def storage_encrypted(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "storage_encrypted", value)


@pulumi.input_type
class _GlobalClusterState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 deletion_protection: Optional[pulumi.Input[bool]] = None,
                 engine: Optional[pulumi.Input[str]] = None,
                 engine_version: Optional[pulumi.Input[str]] = None,
                 global_cluster_identifier: Optional[pulumi.Input[str]] = None,
                 global_cluster_members: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterGlobalClusterMemberArgs']]]] = None,
                 global_cluster_resource_id: Optional[pulumi.Input[str]] = None,
                 source_db_cluster_identifier: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 storage_encrypted: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering GlobalCluster resources.
        :param pulumi.Input[str] arn: Global Cluster Amazon Resource Name (ARN)
        :param pulumi.Input[bool] deletion_protection: If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
        :param pulumi.Input[str] engine: Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Current Valid values: `neptune`. Conflicts with `source_db_cluster_identifier`.
        :param pulumi.Input[str] engine_version: Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
               * **NOTE:** Upgrading major versions is not supported.
        :param pulumi.Input[str] global_cluster_identifier: The global cluster identifier.
        :param pulumi.Input[Sequence[pulumi.Input['GlobalClusterGlobalClusterMemberArgs']]] global_cluster_members: Set of objects containing Global Cluster members.
        :param pulumi.Input[str] global_cluster_resource_id: AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
        :param pulumi.Input[str] source_db_cluster_identifier: Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
        :param pulumi.Input[bool] storage_encrypted: Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if deletion_protection is not None:
            pulumi.set(__self__, "deletion_protection", deletion_protection)
        if engine is not None:
            pulumi.set(__self__, "engine", engine)
        if engine_version is not None:
            pulumi.set(__self__, "engine_version", engine_version)
        if global_cluster_identifier is not None:
            pulumi.set(__self__, "global_cluster_identifier", global_cluster_identifier)
        if global_cluster_members is not None:
            pulumi.set(__self__, "global_cluster_members", global_cluster_members)
        if global_cluster_resource_id is not None:
            pulumi.set(__self__, "global_cluster_resource_id", global_cluster_resource_id)
        if source_db_cluster_identifier is not None:
            pulumi.set(__self__, "source_db_cluster_identifier", source_db_cluster_identifier)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if storage_encrypted is not None:
            pulumi.set(__self__, "storage_encrypted", storage_encrypted)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Global Cluster Amazon Resource Name (ARN)
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="deletionProtection")
    def deletion_protection(self) -> Optional[pulumi.Input[bool]]:
        """
        If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
        """
        return pulumi.get(self, "deletion_protection")

    @deletion_protection.setter
    def deletion_protection(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deletion_protection", value)

    @property
    @pulumi.getter
    def engine(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Current Valid values: `neptune`. Conflicts with `source_db_cluster_identifier`.
        """
        return pulumi.get(self, "engine")

    @engine.setter
    def engine(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "engine", value)

    @property
    @pulumi.getter(name="engineVersion")
    def engine_version(self) -> Optional[pulumi.Input[str]]:
        """
        Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
        * **NOTE:** Upgrading major versions is not supported.
        """
        return pulumi.get(self, "engine_version")

    @engine_version.setter
    def engine_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "engine_version", value)

    @property
    @pulumi.getter(name="globalClusterIdentifier")
    def global_cluster_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        The global cluster identifier.
        """
        return pulumi.get(self, "global_cluster_identifier")

    @global_cluster_identifier.setter
    def global_cluster_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "global_cluster_identifier", value)

    @property
    @pulumi.getter(name="globalClusterMembers")
    def global_cluster_members(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterGlobalClusterMemberArgs']]]]:
        """
        Set of objects containing Global Cluster members.
        """
        return pulumi.get(self, "global_cluster_members")

    @global_cluster_members.setter
    def global_cluster_members(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterGlobalClusterMemberArgs']]]]):
        pulumi.set(self, "global_cluster_members", value)

    @property
    @pulumi.getter(name="globalClusterResourceId")
    def global_cluster_resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
        """
        return pulumi.get(self, "global_cluster_resource_id")

    @global_cluster_resource_id.setter
    def global_cluster_resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "global_cluster_resource_id", value)

    @property
    @pulumi.getter(name="sourceDbClusterIdentifier")
    def source_db_cluster_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
        """
        return pulumi.get(self, "source_db_cluster_identifier")

    @source_db_cluster_identifier.setter
    def source_db_cluster_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_db_cluster_identifier", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="storageEncrypted")
    def storage_encrypted(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
        """
        return pulumi.get(self, "storage_encrypted")

    @storage_encrypted.setter
    def storage_encrypted(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "storage_encrypted", value)


class GlobalCluster(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 deletion_protection: Optional[pulumi.Input[bool]] = None,
                 engine: Optional[pulumi.Input[str]] = None,
                 engine_version: Optional[pulumi.Input[str]] = None,
                 global_cluster_identifier: Optional[pulumi.Input[str]] = None,
                 source_db_cluster_identifier: Optional[pulumi.Input[str]] = None,
                 storage_encrypted: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Manages a Neptune Global Cluster. A global cluster consists of one primary region and up to five read-only secondary regions. You issue write operations directly to the primary cluster in the primary region and Amazon Neptune automatically replicates the data to the secondary regions using dedicated infrastructure.

        More information about Neptune Global Clusters can be found in the [Neptune User Guide](https://docs.aws.amazon.com/neptune/latest/userguide/neptune-global-database.html).

        ## Example Usage
        ### New Neptune Global Cluster

        ```python
        import pulumi
        import pulumi_aws as aws

        primary = aws.Provider("primary", region="us-east-2")
        secondary = aws.Provider("secondary", region="us-east-1")
        example = aws.neptune.GlobalCluster("example",
            global_cluster_identifier="global-test",
            engine="neptune",
            engine_version="1.2.0.0")
        primary_cluster = aws.neptune.Cluster("primaryCluster",
            engine=example.engine,
            engine_version=example.engine_version,
            cluster_identifier="test-primary-cluster",
            global_cluster_identifier=example.id,
            neptune_subnet_group_name="default",
            opts=pulumi.ResourceOptions(provider=aws["primary"]))
        primary_cluster_instance = aws.neptune.ClusterInstance("primaryClusterInstance",
            engine=example.engine,
            engine_version=example.engine_version,
            identifier="test-primary-cluster-instance",
            cluster_identifier=primary_cluster.id,
            instance_class="db.r5.large",
            neptune_subnet_group_name="default",
            opts=pulumi.ResourceOptions(provider=aws["primary"]))
        secondary_cluster = aws.neptune.Cluster("secondaryCluster",
            engine=example.engine,
            engine_version=example.engine_version,
            cluster_identifier="test-secondary-cluster",
            global_cluster_identifier=example.id,
            neptune_subnet_group_name="default",
            opts=pulumi.ResourceOptions(provider=aws["secondary"]))
        secondary_cluster_instance = aws.neptune.ClusterInstance("secondaryClusterInstance",
            engine=example.engine,
            engine_version=example.engine_version,
            identifier="test-secondary-cluster-instance",
            cluster_identifier=secondary_cluster.id,
            instance_class="db.r5.large",
            neptune_subnet_group_name="default",
            opts=pulumi.ResourceOptions(provider=aws["secondary"],
                depends_on=[primary_cluster_instance]))
        ```
        ### New Global Cluster From Existing DB Cluster

        ```python
        import pulumi
        import pulumi_aws as aws

        # ... other configuration ...
        example_cluster = aws.neptune.Cluster("exampleCluster")
        example_global_cluster = aws.neptune.GlobalCluster("exampleGlobalCluster",
            global_cluster_identifier="example",
            source_db_cluster_identifier=example_cluster.arn)
        ```

        ## Import

        Using `pulumi import`, import `aws_neptune_global_cluster` using the Global Cluster identifier. For example:

        ```sh
         $ pulumi import aws:neptune/globalCluster:GlobalCluster example example
        ```
         Certain resource arguments, like `source_db_cluster_identifier`, do not have an API method for reading the information after creation. If the argument is set in the TODO configuration on an imported resource, TODO will always show a difference. To workaround this behavior, either omit the argument from the TODO configuration or use `ignore_changes` to hide the difference. For example:

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] deletion_protection: If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
        :param pulumi.Input[str] engine: Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Current Valid values: `neptune`. Conflicts with `source_db_cluster_identifier`.
        :param pulumi.Input[str] engine_version: Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
               * **NOTE:** Upgrading major versions is not supported.
        :param pulumi.Input[str] global_cluster_identifier: The global cluster identifier.
        :param pulumi.Input[str] source_db_cluster_identifier: Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
        :param pulumi.Input[bool] storage_encrypted: Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GlobalClusterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Neptune Global Cluster. A global cluster consists of one primary region and up to five read-only secondary regions. You issue write operations directly to the primary cluster in the primary region and Amazon Neptune automatically replicates the data to the secondary regions using dedicated infrastructure.

        More information about Neptune Global Clusters can be found in the [Neptune User Guide](https://docs.aws.amazon.com/neptune/latest/userguide/neptune-global-database.html).

        ## Example Usage
        ### New Neptune Global Cluster

        ```python
        import pulumi
        import pulumi_aws as aws

        primary = aws.Provider("primary", region="us-east-2")
        secondary = aws.Provider("secondary", region="us-east-1")
        example = aws.neptune.GlobalCluster("example",
            global_cluster_identifier="global-test",
            engine="neptune",
            engine_version="1.2.0.0")
        primary_cluster = aws.neptune.Cluster("primaryCluster",
            engine=example.engine,
            engine_version=example.engine_version,
            cluster_identifier="test-primary-cluster",
            global_cluster_identifier=example.id,
            neptune_subnet_group_name="default",
            opts=pulumi.ResourceOptions(provider=aws["primary"]))
        primary_cluster_instance = aws.neptune.ClusterInstance("primaryClusterInstance",
            engine=example.engine,
            engine_version=example.engine_version,
            identifier="test-primary-cluster-instance",
            cluster_identifier=primary_cluster.id,
            instance_class="db.r5.large",
            neptune_subnet_group_name="default",
            opts=pulumi.ResourceOptions(provider=aws["primary"]))
        secondary_cluster = aws.neptune.Cluster("secondaryCluster",
            engine=example.engine,
            engine_version=example.engine_version,
            cluster_identifier="test-secondary-cluster",
            global_cluster_identifier=example.id,
            neptune_subnet_group_name="default",
            opts=pulumi.ResourceOptions(provider=aws["secondary"]))
        secondary_cluster_instance = aws.neptune.ClusterInstance("secondaryClusterInstance",
            engine=example.engine,
            engine_version=example.engine_version,
            identifier="test-secondary-cluster-instance",
            cluster_identifier=secondary_cluster.id,
            instance_class="db.r5.large",
            neptune_subnet_group_name="default",
            opts=pulumi.ResourceOptions(provider=aws["secondary"],
                depends_on=[primary_cluster_instance]))
        ```
        ### New Global Cluster From Existing DB Cluster

        ```python
        import pulumi
        import pulumi_aws as aws

        # ... other configuration ...
        example_cluster = aws.neptune.Cluster("exampleCluster")
        example_global_cluster = aws.neptune.GlobalCluster("exampleGlobalCluster",
            global_cluster_identifier="example",
            source_db_cluster_identifier=example_cluster.arn)
        ```

        ## Import

        Using `pulumi import`, import `aws_neptune_global_cluster` using the Global Cluster identifier. For example:

        ```sh
         $ pulumi import aws:neptune/globalCluster:GlobalCluster example example
        ```
         Certain resource arguments, like `source_db_cluster_identifier`, do not have an API method for reading the information after creation. If the argument is set in the TODO configuration on an imported resource, TODO will always show a difference. To workaround this behavior, either omit the argument from the TODO configuration or use `ignore_changes` to hide the difference. For example:

        :param str resource_name: The name of the resource.
        :param GlobalClusterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GlobalClusterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 deletion_protection: Optional[pulumi.Input[bool]] = None,
                 engine: Optional[pulumi.Input[str]] = None,
                 engine_version: Optional[pulumi.Input[str]] = None,
                 global_cluster_identifier: Optional[pulumi.Input[str]] = None,
                 source_db_cluster_identifier: Optional[pulumi.Input[str]] = None,
                 storage_encrypted: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GlobalClusterArgs.__new__(GlobalClusterArgs)

            __props__.__dict__["deletion_protection"] = deletion_protection
            __props__.__dict__["engine"] = engine
            __props__.__dict__["engine_version"] = engine_version
            if global_cluster_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'global_cluster_identifier'")
            __props__.__dict__["global_cluster_identifier"] = global_cluster_identifier
            __props__.__dict__["source_db_cluster_identifier"] = source_db_cluster_identifier
            __props__.__dict__["storage_encrypted"] = storage_encrypted
            __props__.__dict__["arn"] = None
            __props__.__dict__["global_cluster_members"] = None
            __props__.__dict__["global_cluster_resource_id"] = None
            __props__.__dict__["status"] = None
        super(GlobalCluster, __self__).__init__(
            'aws:neptune/globalCluster:GlobalCluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            deletion_protection: Optional[pulumi.Input[bool]] = None,
            engine: Optional[pulumi.Input[str]] = None,
            engine_version: Optional[pulumi.Input[str]] = None,
            global_cluster_identifier: Optional[pulumi.Input[str]] = None,
            global_cluster_members: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GlobalClusterGlobalClusterMemberArgs']]]]] = None,
            global_cluster_resource_id: Optional[pulumi.Input[str]] = None,
            source_db_cluster_identifier: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            storage_encrypted: Optional[pulumi.Input[bool]] = None) -> 'GlobalCluster':
        """
        Get an existing GlobalCluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Global Cluster Amazon Resource Name (ARN)
        :param pulumi.Input[bool] deletion_protection: If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
        :param pulumi.Input[str] engine: Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Current Valid values: `neptune`. Conflicts with `source_db_cluster_identifier`.
        :param pulumi.Input[str] engine_version: Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
               * **NOTE:** Upgrading major versions is not supported.
        :param pulumi.Input[str] global_cluster_identifier: The global cluster identifier.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GlobalClusterGlobalClusterMemberArgs']]]] global_cluster_members: Set of objects containing Global Cluster members.
        :param pulumi.Input[str] global_cluster_resource_id: AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
        :param pulumi.Input[str] source_db_cluster_identifier: Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
        :param pulumi.Input[bool] storage_encrypted: Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GlobalClusterState.__new__(_GlobalClusterState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["deletion_protection"] = deletion_protection
        __props__.__dict__["engine"] = engine
        __props__.__dict__["engine_version"] = engine_version
        __props__.__dict__["global_cluster_identifier"] = global_cluster_identifier
        __props__.__dict__["global_cluster_members"] = global_cluster_members
        __props__.__dict__["global_cluster_resource_id"] = global_cluster_resource_id
        __props__.__dict__["source_db_cluster_identifier"] = source_db_cluster_identifier
        __props__.__dict__["status"] = status
        __props__.__dict__["storage_encrypted"] = storage_encrypted
        return GlobalCluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Global Cluster Amazon Resource Name (ARN)
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="deletionProtection")
    def deletion_protection(self) -> pulumi.Output[Optional[bool]]:
        """
        If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
        """
        return pulumi.get(self, "deletion_protection")

    @property
    @pulumi.getter
    def engine(self) -> pulumi.Output[str]:
        """
        Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Current Valid values: `neptune`. Conflicts with `source_db_cluster_identifier`.
        """
        return pulumi.get(self, "engine")

    @property
    @pulumi.getter(name="engineVersion")
    def engine_version(self) -> pulumi.Output[str]:
        """
        Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
        * **NOTE:** Upgrading major versions is not supported.
        """
        return pulumi.get(self, "engine_version")

    @property
    @pulumi.getter(name="globalClusterIdentifier")
    def global_cluster_identifier(self) -> pulumi.Output[str]:
        """
        The global cluster identifier.
        """
        return pulumi.get(self, "global_cluster_identifier")

    @property
    @pulumi.getter(name="globalClusterMembers")
    def global_cluster_members(self) -> pulumi.Output[Sequence['outputs.GlobalClusterGlobalClusterMember']]:
        """
        Set of objects containing Global Cluster members.
        """
        return pulumi.get(self, "global_cluster_members")

    @property
    @pulumi.getter(name="globalClusterResourceId")
    def global_cluster_resource_id(self) -> pulumi.Output[str]:
        """
        AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
        """
        return pulumi.get(self, "global_cluster_resource_id")

    @property
    @pulumi.getter(name="sourceDbClusterIdentifier")
    def source_db_cluster_identifier(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
        """
        return pulumi.get(self, "source_db_cluster_identifier")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="storageEncrypted")
    def storage_encrypted(self) -> pulumi.Output[bool]:
        """
        Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
        """
        return pulumi.get(self, "storage_encrypted")

