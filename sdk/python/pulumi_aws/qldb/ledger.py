# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['LedgerArgs', 'Ledger']

@pulumi.input_type
class LedgerArgs:
    def __init__(__self__, *,
                 permissions_mode: pulumi.Input[str],
                 deletion_protection: Optional[pulumi.Input[bool]] = None,
                 kms_key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Ledger resource.
        :param pulumi.Input[str] permissions_mode: The permissions mode for the QLDB ledger instance. Specify either `ALLOW_ALL` or `STANDARD`.
        :param pulumi.Input[bool] deletion_protection: The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via the provider, this value must be configured to `false` and applied first before attempting deletion.
        :param pulumi.Input[str] kms_key: The key in AWS Key Management Service (AWS KMS) to use for encryption of data at rest in the ledger. For more information, see the [AWS documentation](https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html). Valid values are `"AWS_OWNED_KMS_KEY"` to use an AWS KMS key that is owned and managed by AWS on your behalf, or the ARN of a valid symmetric customer managed KMS key.
        :param pulumi.Input[str] name: The friendly name for the QLDB Ledger instance. By default generated by the provider.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "permissions_mode", permissions_mode)
        if deletion_protection is not None:
            pulumi.set(__self__, "deletion_protection", deletion_protection)
        if kms_key is not None:
            pulumi.set(__self__, "kms_key", kms_key)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="permissionsMode")
    def permissions_mode(self) -> pulumi.Input[str]:
        """
        The permissions mode for the QLDB ledger instance. Specify either `ALLOW_ALL` or `STANDARD`.
        """
        return pulumi.get(self, "permissions_mode")

    @permissions_mode.setter
    def permissions_mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "permissions_mode", value)

    @property
    @pulumi.getter(name="deletionProtection")
    def deletion_protection(self) -> Optional[pulumi.Input[bool]]:
        """
        The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via the provider, this value must be configured to `false` and applied first before attempting deletion.
        """
        return pulumi.get(self, "deletion_protection")

    @deletion_protection.setter
    def deletion_protection(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deletion_protection", value)

    @property
    @pulumi.getter(name="kmsKey")
    def kms_key(self) -> Optional[pulumi.Input[str]]:
        """
        The key in AWS Key Management Service (AWS KMS) to use for encryption of data at rest in the ledger. For more information, see the [AWS documentation](https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html). Valid values are `"AWS_OWNED_KMS_KEY"` to use an AWS KMS key that is owned and managed by AWS on your behalf, or the ARN of a valid symmetric customer managed KMS key.
        """
        return pulumi.get(self, "kms_key")

    @kms_key.setter
    def kms_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The friendly name for the QLDB Ledger instance. By default generated by the provider.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

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


@pulumi.input_type
class _LedgerState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 deletion_protection: Optional[pulumi.Input[bool]] = None,
                 kms_key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions_mode: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Ledger resources.
        :param pulumi.Input[str] arn: The ARN of the QLDB Ledger
        :param pulumi.Input[bool] deletion_protection: The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via the provider, this value must be configured to `false` and applied first before attempting deletion.
        :param pulumi.Input[str] kms_key: The key in AWS Key Management Service (AWS KMS) to use for encryption of data at rest in the ledger. For more information, see the [AWS documentation](https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html). Valid values are `"AWS_OWNED_KMS_KEY"` to use an AWS KMS key that is owned and managed by AWS on your behalf, or the ARN of a valid symmetric customer managed KMS key.
        :param pulumi.Input[str] name: The friendly name for the QLDB Ledger instance. By default generated by the provider.
        :param pulumi.Input[str] permissions_mode: The permissions mode for the QLDB ledger instance. Specify either `ALLOW_ALL` or `STANDARD`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if deletion_protection is not None:
            pulumi.set(__self__, "deletion_protection", deletion_protection)
        if kms_key is not None:
            pulumi.set(__self__, "kms_key", kms_key)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if permissions_mode is not None:
            pulumi.set(__self__, "permissions_mode", permissions_mode)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the QLDB Ledger
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="deletionProtection")
    def deletion_protection(self) -> Optional[pulumi.Input[bool]]:
        """
        The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via the provider, this value must be configured to `false` and applied first before attempting deletion.
        """
        return pulumi.get(self, "deletion_protection")

    @deletion_protection.setter
    def deletion_protection(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deletion_protection", value)

    @property
    @pulumi.getter(name="kmsKey")
    def kms_key(self) -> Optional[pulumi.Input[str]]:
        """
        The key in AWS Key Management Service (AWS KMS) to use for encryption of data at rest in the ledger. For more information, see the [AWS documentation](https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html). Valid values are `"AWS_OWNED_KMS_KEY"` to use an AWS KMS key that is owned and managed by AWS on your behalf, or the ARN of a valid symmetric customer managed KMS key.
        """
        return pulumi.get(self, "kms_key")

    @kms_key.setter
    def kms_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The friendly name for the QLDB Ledger instance. By default generated by the provider.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="permissionsMode")
    def permissions_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The permissions mode for the QLDB ledger instance. Specify either `ALLOW_ALL` or `STANDARD`.
        """
        return pulumi.get(self, "permissions_mode")

    @permissions_mode.setter
    def permissions_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "permissions_mode", value)

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


class Ledger(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 deletion_protection: Optional[pulumi.Input[bool]] = None,
                 kms_key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions_mode: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an AWS Quantum Ledger Database (QLDB) resource

        > **NOTE:** Deletion protection is enabled by default. To successfully delete this resource via this provider, `deletion_protection = false` must be applied before attempting deletion.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        sample_ledger = aws.qldb.Ledger("sample-ledger",
            name="sample-ledger",
            permissions_mode="STANDARD")
        ```

        ## Import

        Using `pulumi import`, import QLDB Ledgers using the `name`. For example:

        ```sh
         $ pulumi import aws:qldb/ledger:Ledger sample-ledger sample-ledger
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] deletion_protection: The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via the provider, this value must be configured to `false` and applied first before attempting deletion.
        :param pulumi.Input[str] kms_key: The key in AWS Key Management Service (AWS KMS) to use for encryption of data at rest in the ledger. For more information, see the [AWS documentation](https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html). Valid values are `"AWS_OWNED_KMS_KEY"` to use an AWS KMS key that is owned and managed by AWS on your behalf, or the ARN of a valid symmetric customer managed KMS key.
        :param pulumi.Input[str] name: The friendly name for the QLDB Ledger instance. By default generated by the provider.
        :param pulumi.Input[str] permissions_mode: The permissions mode for the QLDB ledger instance. Specify either `ALLOW_ALL` or `STANDARD`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LedgerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an AWS Quantum Ledger Database (QLDB) resource

        > **NOTE:** Deletion protection is enabled by default. To successfully delete this resource via this provider, `deletion_protection = false` must be applied before attempting deletion.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        sample_ledger = aws.qldb.Ledger("sample-ledger",
            name="sample-ledger",
            permissions_mode="STANDARD")
        ```

        ## Import

        Using `pulumi import`, import QLDB Ledgers using the `name`. For example:

        ```sh
         $ pulumi import aws:qldb/ledger:Ledger sample-ledger sample-ledger
        ```

        :param str resource_name: The name of the resource.
        :param LedgerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LedgerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 deletion_protection: Optional[pulumi.Input[bool]] = None,
                 kms_key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions_mode: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LedgerArgs.__new__(LedgerArgs)

            __props__.__dict__["deletion_protection"] = deletion_protection
            __props__.__dict__["kms_key"] = kms_key
            __props__.__dict__["name"] = name
            if permissions_mode is None and not opts.urn:
                raise TypeError("Missing required property 'permissions_mode'")
            __props__.__dict__["permissions_mode"] = permissions_mode
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(Ledger, __self__).__init__(
            'aws:qldb/ledger:Ledger',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            deletion_protection: Optional[pulumi.Input[bool]] = None,
            kms_key: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            permissions_mode: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Ledger':
        """
        Get an existing Ledger resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the QLDB Ledger
        :param pulumi.Input[bool] deletion_protection: The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via the provider, this value must be configured to `false` and applied first before attempting deletion.
        :param pulumi.Input[str] kms_key: The key in AWS Key Management Service (AWS KMS) to use for encryption of data at rest in the ledger. For more information, see the [AWS documentation](https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html). Valid values are `"AWS_OWNED_KMS_KEY"` to use an AWS KMS key that is owned and managed by AWS on your behalf, or the ARN of a valid symmetric customer managed KMS key.
        :param pulumi.Input[str] name: The friendly name for the QLDB Ledger instance. By default generated by the provider.
        :param pulumi.Input[str] permissions_mode: The permissions mode for the QLDB ledger instance. Specify either `ALLOW_ALL` or `STANDARD`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LedgerState.__new__(_LedgerState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["deletion_protection"] = deletion_protection
        __props__.__dict__["kms_key"] = kms_key
        __props__.__dict__["name"] = name
        __props__.__dict__["permissions_mode"] = permissions_mode
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Ledger(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the QLDB Ledger
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="deletionProtection")
    def deletion_protection(self) -> pulumi.Output[Optional[bool]]:
        """
        The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via the provider, this value must be configured to `false` and applied first before attempting deletion.
        """
        return pulumi.get(self, "deletion_protection")

    @property
    @pulumi.getter(name="kmsKey")
    def kms_key(self) -> pulumi.Output[str]:
        """
        The key in AWS Key Management Service (AWS KMS) to use for encryption of data at rest in the ledger. For more information, see the [AWS documentation](https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html). Valid values are `"AWS_OWNED_KMS_KEY"` to use an AWS KMS key that is owned and managed by AWS on your behalf, or the ARN of a valid symmetric customer managed KMS key.
        """
        return pulumi.get(self, "kms_key")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The friendly name for the QLDB Ledger instance. By default generated by the provider.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="permissionsMode")
    def permissions_mode(self) -> pulumi.Output[str]:
        """
        The permissions mode for the QLDB ledger instance. Specify either `ALLOW_ALL` or `STANDARD`.
        """
        return pulumi.get(self, "permissions_mode")

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

