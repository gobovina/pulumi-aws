# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['InstanceAutomatedBackupsReplicationArgs', 'InstanceAutomatedBackupsReplication']

@pulumi.input_type
class InstanceAutomatedBackupsReplicationArgs:
    def __init__(__self__, *,
                 source_db_instance_arn: pulumi.Input[str],
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 pre_signed_url: Optional[pulumi.Input[str]] = None,
                 retention_period: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a InstanceAutomatedBackupsReplication resource.
        :param pulumi.Input[str] source_db_instance_arn: The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example, `arn:aws:rds:us-west-2:123456789012:db:mydatabase`.
        :param pulumi.Input[str] kms_key_id: The AWS KMS key identifier for encryption of the replicated automated backups. The KMS key ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination AWS Region, for example, `arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE`.
        :param pulumi.Input[str] pre_signed_url: A URL that contains a [Signature Version 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) signed request for the [`StartDBInstanceAutomatedBackupsReplication`](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartDBInstanceAutomatedBackupsReplication.html) action to be called in the AWS Region of the source DB instance.
        :param pulumi.Input[int] retention_period: The retention period for the replicated automated backups, defaults to `7`.
        """
        pulumi.set(__self__, "source_db_instance_arn", source_db_instance_arn)
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)
        if pre_signed_url is not None:
            pulumi.set(__self__, "pre_signed_url", pre_signed_url)
        if retention_period is not None:
            pulumi.set(__self__, "retention_period", retention_period)

    @property
    @pulumi.getter(name="sourceDbInstanceArn")
    def source_db_instance_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example, `arn:aws:rds:us-west-2:123456789012:db:mydatabase`.
        """
        return pulumi.get(self, "source_db_instance_arn")

    @source_db_instance_arn.setter
    def source_db_instance_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_db_instance_arn", value)

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS KMS key identifier for encryption of the replicated automated backups. The KMS key ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination AWS Region, for example, `arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE`.
        """
        return pulumi.get(self, "kms_key_id")

    @kms_key_id.setter
    def kms_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_id", value)

    @property
    @pulumi.getter(name="preSignedUrl")
    def pre_signed_url(self) -> Optional[pulumi.Input[str]]:
        """
        A URL that contains a [Signature Version 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) signed request for the [`StartDBInstanceAutomatedBackupsReplication`](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartDBInstanceAutomatedBackupsReplication.html) action to be called in the AWS Region of the source DB instance.
        """
        return pulumi.get(self, "pre_signed_url")

    @pre_signed_url.setter
    def pre_signed_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pre_signed_url", value)

    @property
    @pulumi.getter(name="retentionPeriod")
    def retention_period(self) -> Optional[pulumi.Input[int]]:
        """
        The retention period for the replicated automated backups, defaults to `7`.
        """
        return pulumi.get(self, "retention_period")

    @retention_period.setter
    def retention_period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention_period", value)


@pulumi.input_type
class _InstanceAutomatedBackupsReplicationState:
    def __init__(__self__, *,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 pre_signed_url: Optional[pulumi.Input[str]] = None,
                 retention_period: Optional[pulumi.Input[int]] = None,
                 source_db_instance_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering InstanceAutomatedBackupsReplication resources.
        :param pulumi.Input[str] kms_key_id: The AWS KMS key identifier for encryption of the replicated automated backups. The KMS key ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination AWS Region, for example, `arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE`.
        :param pulumi.Input[str] pre_signed_url: A URL that contains a [Signature Version 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) signed request for the [`StartDBInstanceAutomatedBackupsReplication`](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartDBInstanceAutomatedBackupsReplication.html) action to be called in the AWS Region of the source DB instance.
        :param pulumi.Input[int] retention_period: The retention period for the replicated automated backups, defaults to `7`.
        :param pulumi.Input[str] source_db_instance_arn: The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example, `arn:aws:rds:us-west-2:123456789012:db:mydatabase`.
        """
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)
        if pre_signed_url is not None:
            pulumi.set(__self__, "pre_signed_url", pre_signed_url)
        if retention_period is not None:
            pulumi.set(__self__, "retention_period", retention_period)
        if source_db_instance_arn is not None:
            pulumi.set(__self__, "source_db_instance_arn", source_db_instance_arn)

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS KMS key identifier for encryption of the replicated automated backups. The KMS key ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination AWS Region, for example, `arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE`.
        """
        return pulumi.get(self, "kms_key_id")

    @kms_key_id.setter
    def kms_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_id", value)

    @property
    @pulumi.getter(name="preSignedUrl")
    def pre_signed_url(self) -> Optional[pulumi.Input[str]]:
        """
        A URL that contains a [Signature Version 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) signed request for the [`StartDBInstanceAutomatedBackupsReplication`](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartDBInstanceAutomatedBackupsReplication.html) action to be called in the AWS Region of the source DB instance.
        """
        return pulumi.get(self, "pre_signed_url")

    @pre_signed_url.setter
    def pre_signed_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pre_signed_url", value)

    @property
    @pulumi.getter(name="retentionPeriod")
    def retention_period(self) -> Optional[pulumi.Input[int]]:
        """
        The retention period for the replicated automated backups, defaults to `7`.
        """
        return pulumi.get(self, "retention_period")

    @retention_period.setter
    def retention_period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention_period", value)

    @property
    @pulumi.getter(name="sourceDbInstanceArn")
    def source_db_instance_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example, `arn:aws:rds:us-west-2:123456789012:db:mydatabase`.
        """
        return pulumi.get(self, "source_db_instance_arn")

    @source_db_instance_arn.setter
    def source_db_instance_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_db_instance_arn", value)


class InstanceAutomatedBackupsReplication(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 pre_signed_url: Optional[pulumi.Input[str]] = None,
                 retention_period: Optional[pulumi.Input[int]] = None,
                 source_db_instance_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manage cross-region replication of automated backups to a different AWS Region. Documentation for cross-region automated backup replication can be found at:

        * [Replicating automated backups to another AWS Region](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html)

        > **Note:** This resource has to be created in the destination region.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.rds.InstanceAutomatedBackupsReplication("default",
            retention_period=14,
            source_db_instance_arn="arn:aws:rds:us-west-2:123456789012:db:mydatabase")
        ```
        ## Encrypting the automated backup with KMS

        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.rds.InstanceAutomatedBackupsReplication("default",
            kms_key_id="arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012",
            source_db_instance_arn="arn:aws:rds:us-west-2:123456789012:db:mydatabase")
        ```

        ## Example including a RDS DB instance

        ```python
        import pulumi
        import pulumi_aws as aws

        replica = aws.Provider("replica", region="us-west-2")
        default_instance = aws.rds.Instance("defaultInstance",
            allocated_storage=10,
            identifier="mydb",
            engine="postgres",
            engine_version="13.4",
            instance_class="db.t3.micro",
            db_name="mydb",
            username="masterusername",
            password="mustbeeightcharacters",
            backup_retention_period=7,
            storage_encrypted=True,
            skip_final_snapshot=True)
        default_key = aws.kms.Key("defaultKey", description="Encryption key for automated backups",
        opts=pulumi.ResourceOptions(provider=aws["replica"]))
        default_instance_automated_backups_replication = aws.rds.InstanceAutomatedBackupsReplication("defaultInstanceAutomatedBackupsReplication",
            source_db_instance_arn=default_instance.arn,
            kms_key_id=default_key.arn,
            opts=pulumi.ResourceOptions(provider=aws["replica"]))
        ```

        ## Import

        In TODO v1.5.0 and later, use an `import` block to import RDS instance automated backups replication using the `arn`. For exampleterraform import {

         to = aws_db_instance_automated_backups_replication.default

         id = "arn:aws:rds:us-east-1:123456789012:auto-backup:ab-faaa2mgdj1vmp4xflr7yhsrmtbtob7ltrzzz2my" } Using `TODO import`, import RDS instance automated backups replication using the `arn`. For exampleconsole % TODO import aws_db_instance_automated_backups_replication.default arn:aws:rds:us-east-1:123456789012:auto-backup:ab-faaa2mgdj1vmp4xflr7yhsrmtbtob7ltrzzz2my

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] kms_key_id: The AWS KMS key identifier for encryption of the replicated automated backups. The KMS key ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination AWS Region, for example, `arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE`.
        :param pulumi.Input[str] pre_signed_url: A URL that contains a [Signature Version 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) signed request for the [`StartDBInstanceAutomatedBackupsReplication`](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartDBInstanceAutomatedBackupsReplication.html) action to be called in the AWS Region of the source DB instance.
        :param pulumi.Input[int] retention_period: The retention period for the replicated automated backups, defaults to `7`.
        :param pulumi.Input[str] source_db_instance_arn: The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example, `arn:aws:rds:us-west-2:123456789012:db:mydatabase`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceAutomatedBackupsReplicationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manage cross-region replication of automated backups to a different AWS Region. Documentation for cross-region automated backup replication can be found at:

        * [Replicating automated backups to another AWS Region](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html)

        > **Note:** This resource has to be created in the destination region.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.rds.InstanceAutomatedBackupsReplication("default",
            retention_period=14,
            source_db_instance_arn="arn:aws:rds:us-west-2:123456789012:db:mydatabase")
        ```
        ## Encrypting the automated backup with KMS

        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.rds.InstanceAutomatedBackupsReplication("default",
            kms_key_id="arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012",
            source_db_instance_arn="arn:aws:rds:us-west-2:123456789012:db:mydatabase")
        ```

        ## Example including a RDS DB instance

        ```python
        import pulumi
        import pulumi_aws as aws

        replica = aws.Provider("replica", region="us-west-2")
        default_instance = aws.rds.Instance("defaultInstance",
            allocated_storage=10,
            identifier="mydb",
            engine="postgres",
            engine_version="13.4",
            instance_class="db.t3.micro",
            db_name="mydb",
            username="masterusername",
            password="mustbeeightcharacters",
            backup_retention_period=7,
            storage_encrypted=True,
            skip_final_snapshot=True)
        default_key = aws.kms.Key("defaultKey", description="Encryption key for automated backups",
        opts=pulumi.ResourceOptions(provider=aws["replica"]))
        default_instance_automated_backups_replication = aws.rds.InstanceAutomatedBackupsReplication("defaultInstanceAutomatedBackupsReplication",
            source_db_instance_arn=default_instance.arn,
            kms_key_id=default_key.arn,
            opts=pulumi.ResourceOptions(provider=aws["replica"]))
        ```

        ## Import

        In TODO v1.5.0 and later, use an `import` block to import RDS instance automated backups replication using the `arn`. For exampleterraform import {

         to = aws_db_instance_automated_backups_replication.default

         id = "arn:aws:rds:us-east-1:123456789012:auto-backup:ab-faaa2mgdj1vmp4xflr7yhsrmtbtob7ltrzzz2my" } Using `TODO import`, import RDS instance automated backups replication using the `arn`. For exampleconsole % TODO import aws_db_instance_automated_backups_replication.default arn:aws:rds:us-east-1:123456789012:auto-backup:ab-faaa2mgdj1vmp4xflr7yhsrmtbtob7ltrzzz2my

        :param str resource_name: The name of the resource.
        :param InstanceAutomatedBackupsReplicationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceAutomatedBackupsReplicationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 pre_signed_url: Optional[pulumi.Input[str]] = None,
                 retention_period: Optional[pulumi.Input[int]] = None,
                 source_db_instance_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceAutomatedBackupsReplicationArgs.__new__(InstanceAutomatedBackupsReplicationArgs)

            __props__.__dict__["kms_key_id"] = kms_key_id
            __props__.__dict__["pre_signed_url"] = pre_signed_url
            __props__.__dict__["retention_period"] = retention_period
            if source_db_instance_arn is None and not opts.urn:
                raise TypeError("Missing required property 'source_db_instance_arn'")
            __props__.__dict__["source_db_instance_arn"] = source_db_instance_arn
        super(InstanceAutomatedBackupsReplication, __self__).__init__(
            'aws:rds/instanceAutomatedBackupsReplication:InstanceAutomatedBackupsReplication',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            kms_key_id: Optional[pulumi.Input[str]] = None,
            pre_signed_url: Optional[pulumi.Input[str]] = None,
            retention_period: Optional[pulumi.Input[int]] = None,
            source_db_instance_arn: Optional[pulumi.Input[str]] = None) -> 'InstanceAutomatedBackupsReplication':
        """
        Get an existing InstanceAutomatedBackupsReplication resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] kms_key_id: The AWS KMS key identifier for encryption of the replicated automated backups. The KMS key ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination AWS Region, for example, `arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE`.
        :param pulumi.Input[str] pre_signed_url: A URL that contains a [Signature Version 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) signed request for the [`StartDBInstanceAutomatedBackupsReplication`](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartDBInstanceAutomatedBackupsReplication.html) action to be called in the AWS Region of the source DB instance.
        :param pulumi.Input[int] retention_period: The retention period for the replicated automated backups, defaults to `7`.
        :param pulumi.Input[str] source_db_instance_arn: The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example, `arn:aws:rds:us-west-2:123456789012:db:mydatabase`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceAutomatedBackupsReplicationState.__new__(_InstanceAutomatedBackupsReplicationState)

        __props__.__dict__["kms_key_id"] = kms_key_id
        __props__.__dict__["pre_signed_url"] = pre_signed_url
        __props__.__dict__["retention_period"] = retention_period
        __props__.__dict__["source_db_instance_arn"] = source_db_instance_arn
        return InstanceAutomatedBackupsReplication(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> pulumi.Output[str]:
        """
        The AWS KMS key identifier for encryption of the replicated automated backups. The KMS key ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination AWS Region, for example, `arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE`.
        """
        return pulumi.get(self, "kms_key_id")

    @property
    @pulumi.getter(name="preSignedUrl")
    def pre_signed_url(self) -> pulumi.Output[Optional[str]]:
        """
        A URL that contains a [Signature Version 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) signed request for the [`StartDBInstanceAutomatedBackupsReplication`](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartDBInstanceAutomatedBackupsReplication.html) action to be called in the AWS Region of the source DB instance.
        """
        return pulumi.get(self, "pre_signed_url")

    @property
    @pulumi.getter(name="retentionPeriod")
    def retention_period(self) -> pulumi.Output[Optional[int]]:
        """
        The retention period for the replicated automated backups, defaults to `7`.
        """
        return pulumi.get(self, "retention_period")

    @property
    @pulumi.getter(name="sourceDbInstanceArn")
    def source_db_instance_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example, `arn:aws:rds:us-west-2:123456789012:db:mydatabase`.
        """
        return pulumi.get(self, "source_db_instance_arn")

