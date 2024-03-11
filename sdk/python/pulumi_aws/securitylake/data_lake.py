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

__all__ = ['DataLakeArgs', 'DataLake']

@pulumi.input_type
class DataLakeArgs:
    def __init__(__self__, *,
                 meta_store_manager_role_arn: pulumi.Input[str],
                 configuration: Optional[pulumi.Input['DataLakeConfigurationArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input['DataLakeTimeoutsArgs']] = None):
        """
        The set of arguments for constructing a DataLake resource.
        :param pulumi.Input[str] meta_store_manager_role_arn: The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
        :param pulumi.Input['DataLakeConfigurationArgs'] configuration: Specify the Region or Regions that will contribute data to the rollup region.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "meta_store_manager_role_arn", meta_store_manager_role_arn)
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="metaStoreManagerRoleArn")
    def meta_store_manager_role_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
        """
        return pulumi.get(self, "meta_store_manager_role_arn")

    @meta_store_manager_role_arn.setter
    def meta_store_manager_role_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "meta_store_manager_role_arn", value)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input['DataLakeConfigurationArgs']]:
        """
        Specify the Region or Regions that will contribute data to the rollup region.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input['DataLakeConfigurationArgs']]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['DataLakeTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['DataLakeTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


@pulumi.input_type
class _DataLakeState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 configuration: Optional[pulumi.Input['DataLakeConfigurationArgs']] = None,
                 meta_store_manager_role_arn: Optional[pulumi.Input[str]] = None,
                 s3_bucket_arn: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input['DataLakeTimeoutsArgs']] = None):
        """
        Input properties used for looking up and filtering DataLake resources.
        :param pulumi.Input[str] arn: ARN of the Data Lake.
        :param pulumi.Input['DataLakeConfigurationArgs'] configuration: Specify the Region or Regions that will contribute data to the rollup region.
        :param pulumi.Input[str] meta_store_manager_role_arn: The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
        :param pulumi.Input[str] s3_bucket_arn: The ARN for the Amazon Security Lake Amazon S3 bucket.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)
        if meta_store_manager_role_arn is not None:
            pulumi.set(__self__, "meta_store_manager_role_arn", meta_store_manager_role_arn)
        if s3_bucket_arn is not None:
            pulumi.set(__self__, "s3_bucket_arn", s3_bucket_arn)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the Data Lake.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input['DataLakeConfigurationArgs']]:
        """
        Specify the Region or Regions that will contribute data to the rollup region.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input['DataLakeConfigurationArgs']]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter(name="metaStoreManagerRoleArn")
    def meta_store_manager_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
        """
        return pulumi.get(self, "meta_store_manager_role_arn")

    @meta_store_manager_role_arn.setter
    def meta_store_manager_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "meta_store_manager_role_arn", value)

    @property
    @pulumi.getter(name="s3BucketArn")
    def s3_bucket_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN for the Amazon Security Lake Amazon S3 bucket.
        """
        return pulumi.get(self, "s3_bucket_arn")

    @s3_bucket_arn.setter
    def s3_bucket_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "s3_bucket_arn", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['DataLakeTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['DataLakeTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


class DataLake(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration: Optional[pulumi.Input[pulumi.InputType['DataLakeConfigurationArgs']]] = None,
                 meta_store_manager_role_arn: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['DataLakeTimeoutsArgs']]] = None,
                 __props__=None):
        """
        Resource for managing an AWS Security Lake Data Lake.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.securitylake.DataLake("example",
            meta_store_manager_role_arn=meta_store_manager["arn"],
            configuration=aws.securitylake.DataLakeConfigurationArgs(
                region="eu-west-1",
                encryption_configurations=[aws.securitylake.DataLakeConfigurationEncryptionConfigurationArgs(
                    kms_key_id="S3_MANAGED_KEY",
                )],
                lifecycle_configuration=aws.securitylake.DataLakeConfigurationLifecycleConfigurationArgs(
                    transitions=[
                        aws.securitylake.DataLakeConfigurationLifecycleConfigurationTransitionArgs(
                            days=31,
                            storage_class="STANDARD_IA",
                        ),
                        aws.securitylake.DataLakeConfigurationLifecycleConfigurationTransitionArgs(
                            days=80,
                            storage_class="ONEZONE_IA",
                        ),
                    ],
                    expiration=aws.securitylake.DataLakeConfigurationLifecycleConfigurationExpirationArgs(
                        days=300,
                    ),
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.securitylake.DataLake("example",
            meta_store_manager_role_arn=meta_store_manager["arn"],
            configuration=aws.securitylake.DataLakeConfigurationArgs(
                region="eu-west-1",
                encryption_configurations=[aws.securitylake.DataLakeConfigurationEncryptionConfigurationArgs(
                    kms_key_id="S3_MANAGED_KEY",
                )],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Security Hub standards subscriptions using the standards subscription ARN. For example:

        ```sh
        $ pulumi import aws:securitylake/dataLake:DataLake example arn:aws:securitylake:eu-west-1:123456789012:data-lake/default
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['DataLakeConfigurationArgs']] configuration: Specify the Region or Regions that will contribute data to the rollup region.
        :param pulumi.Input[str] meta_store_manager_role_arn: The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DataLakeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS Security Lake Data Lake.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.securitylake.DataLake("example",
            meta_store_manager_role_arn=meta_store_manager["arn"],
            configuration=aws.securitylake.DataLakeConfigurationArgs(
                region="eu-west-1",
                encryption_configurations=[aws.securitylake.DataLakeConfigurationEncryptionConfigurationArgs(
                    kms_key_id="S3_MANAGED_KEY",
                )],
                lifecycle_configuration=aws.securitylake.DataLakeConfigurationLifecycleConfigurationArgs(
                    transitions=[
                        aws.securitylake.DataLakeConfigurationLifecycleConfigurationTransitionArgs(
                            days=31,
                            storage_class="STANDARD_IA",
                        ),
                        aws.securitylake.DataLakeConfigurationLifecycleConfigurationTransitionArgs(
                            days=80,
                            storage_class="ONEZONE_IA",
                        ),
                    ],
                    expiration=aws.securitylake.DataLakeConfigurationLifecycleConfigurationExpirationArgs(
                        days=300,
                    ),
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.securitylake.DataLake("example",
            meta_store_manager_role_arn=meta_store_manager["arn"],
            configuration=aws.securitylake.DataLakeConfigurationArgs(
                region="eu-west-1",
                encryption_configurations=[aws.securitylake.DataLakeConfigurationEncryptionConfigurationArgs(
                    kms_key_id="S3_MANAGED_KEY",
                )],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Security Hub standards subscriptions using the standards subscription ARN. For example:

        ```sh
        $ pulumi import aws:securitylake/dataLake:DataLake example arn:aws:securitylake:eu-west-1:123456789012:data-lake/default
        ```

        :param str resource_name: The name of the resource.
        :param DataLakeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DataLakeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration: Optional[pulumi.Input[pulumi.InputType['DataLakeConfigurationArgs']]] = None,
                 meta_store_manager_role_arn: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['DataLakeTimeoutsArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DataLakeArgs.__new__(DataLakeArgs)

            __props__.__dict__["configuration"] = configuration
            if meta_store_manager_role_arn is None and not opts.urn:
                raise TypeError("Missing required property 'meta_store_manager_role_arn'")
            __props__.__dict__["meta_store_manager_role_arn"] = meta_store_manager_role_arn
            __props__.__dict__["tags"] = tags
            __props__.__dict__["timeouts"] = timeouts
            __props__.__dict__["arn"] = None
            __props__.__dict__["s3_bucket_arn"] = None
            __props__.__dict__["tags_all"] = None
        super(DataLake, __self__).__init__(
            'aws:securitylake/dataLake:DataLake',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            configuration: Optional[pulumi.Input[pulumi.InputType['DataLakeConfigurationArgs']]] = None,
            meta_store_manager_role_arn: Optional[pulumi.Input[str]] = None,
            s3_bucket_arn: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            timeouts: Optional[pulumi.Input[pulumi.InputType['DataLakeTimeoutsArgs']]] = None) -> 'DataLake':
        """
        Get an existing DataLake resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the Data Lake.
        :param pulumi.Input[pulumi.InputType['DataLakeConfigurationArgs']] configuration: Specify the Region or Regions that will contribute data to the rollup region.
        :param pulumi.Input[str] meta_store_manager_role_arn: The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
        :param pulumi.Input[str] s3_bucket_arn: The ARN for the Amazon Security Lake Amazon S3 bucket.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DataLakeState.__new__(_DataLakeState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["configuration"] = configuration
        __props__.__dict__["meta_store_manager_role_arn"] = meta_store_manager_role_arn
        __props__.__dict__["s3_bucket_arn"] = s3_bucket_arn
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["timeouts"] = timeouts
        return DataLake(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the Data Lake.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Output[Optional['outputs.DataLakeConfiguration']]:
        """
        Specify the Region or Regions that will contribute data to the rollup region.
        """
        return pulumi.get(self, "configuration")

    @property
    @pulumi.getter(name="metaStoreManagerRoleArn")
    def meta_store_manager_role_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
        """
        return pulumi.get(self, "meta_store_manager_role_arn")

    @property
    @pulumi.getter(name="s3BucketArn")
    def s3_bucket_arn(self) -> pulumi.Output[str]:
        """
        The ARN for the Amazon Security Lake Amazon S3 bucket.
        """
        return pulumi.get(self, "s3_bucket_arn")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.DataLakeTimeouts']]:
        return pulumi.get(self, "timeouts")

