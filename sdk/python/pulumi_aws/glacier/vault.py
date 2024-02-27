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

__all__ = ['VaultArgs', 'Vault']

@pulumi.input_type
class VaultArgs:
    def __init__(__self__, *,
                 access_policy: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notification: Optional[pulumi.Input['VaultNotificationArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Vault resource.
        :param pulumi.Input[str] access_policy: The policy document. This is a JSON formatted string.
               The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
        :param pulumi.Input[str] name: The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
        :param pulumi.Input['VaultNotificationArgs'] notification: The notifications for the Vault. Fields documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        if access_policy is not None:
            pulumi.set(__self__, "access_policy", access_policy)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if notification is not None:
            pulumi.set(__self__, "notification", notification)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="accessPolicy")
    def access_policy(self) -> Optional[pulumi.Input[str]]:
        """
        The policy document. This is a JSON formatted string.
        The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
        """
        return pulumi.get(self, "access_policy")

    @access_policy.setter
    def access_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_policy", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def notification(self) -> Optional[pulumi.Input['VaultNotificationArgs']]:
        """
        The notifications for the Vault. Fields documented below.
        """
        return pulumi.get(self, "notification")

    @notification.setter
    def notification(self, value: Optional[pulumi.Input['VaultNotificationArgs']]):
        pulumi.set(self, "notification", value)

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
class _VaultState:
    def __init__(__self__, *,
                 access_policy: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notification: Optional[pulumi.Input['VaultNotificationArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Vault resources.
        :param pulumi.Input[str] access_policy: The policy document. This is a JSON formatted string.
               The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
        :param pulumi.Input[str] arn: The ARN of the vault.
        :param pulumi.Input[str] location: The URI of the vault that was created.
        :param pulumi.Input[str] name: The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
        :param pulumi.Input['VaultNotificationArgs'] notification: The notifications for the Vault. Fields documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if access_policy is not None:
            pulumi.set(__self__, "access_policy", access_policy)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if notification is not None:
            pulumi.set(__self__, "notification", notification)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter(name="accessPolicy")
    def access_policy(self) -> Optional[pulumi.Input[str]]:
        """
        The policy document. This is a JSON formatted string.
        The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
        """
        return pulumi.get(self, "access_policy")

    @access_policy.setter
    def access_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_policy", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the vault.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The URI of the vault that was created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def notification(self) -> Optional[pulumi.Input['VaultNotificationArgs']]:
        """
        The notifications for the Vault. Fields documented below.
        """
        return pulumi.get(self, "notification")

    @notification.setter
    def notification(self, value: Optional[pulumi.Input['VaultNotificationArgs']]):
        pulumi.set(self, "notification", value)

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
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class Vault(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_policy: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notification: Optional[pulumi.Input[pulumi.InputType['VaultNotificationArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Glacier Vault Resource. You can refer to the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-vaults.html) for a full explanation of the Glacier Vault functionality

        > **NOTE:** When removing a Glacier Vault, the Vault must be empty.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        aws_sns_topic = aws.sns.Topic("awsSnsTopic")
        my_archive_policy_document = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            sid="add-read-only-perm",
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="*",
                identifiers=["*"],
            )],
            actions=[
                "glacier:InitiateJob",
                "glacier:GetJobOutput",
            ],
            resources=["arn:aws:glacier:eu-west-1:432981146916:vaults/MyArchive"],
        )])
        my_archive_vault = aws.glacier.Vault("myArchiveVault",
            notification=aws.glacier.VaultNotificationArgs(
                sns_topic=aws_sns_topic.arn,
                events=[
                    "ArchiveRetrievalCompleted",
                    "InventoryRetrievalCompleted",
                ],
            ),
            access_policy=my_archive_policy_document.json,
            tags={
                "Test": "MyArchive",
            })
        ```

        ## Import

        Using `pulumi import`, import Glacier Vaults using the `name`. For example:

        ```sh
         $ pulumi import aws:glacier/vault:Vault archive my_archive
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_policy: The policy document. This is a JSON formatted string.
               The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
        :param pulumi.Input[str] name: The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
        :param pulumi.Input[pulumi.InputType['VaultNotificationArgs']] notification: The notifications for the Vault. Fields documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[VaultArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Glacier Vault Resource. You can refer to the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-vaults.html) for a full explanation of the Glacier Vault functionality

        > **NOTE:** When removing a Glacier Vault, the Vault must be empty.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        aws_sns_topic = aws.sns.Topic("awsSnsTopic")
        my_archive_policy_document = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            sid="add-read-only-perm",
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="*",
                identifiers=["*"],
            )],
            actions=[
                "glacier:InitiateJob",
                "glacier:GetJobOutput",
            ],
            resources=["arn:aws:glacier:eu-west-1:432981146916:vaults/MyArchive"],
        )])
        my_archive_vault = aws.glacier.Vault("myArchiveVault",
            notification=aws.glacier.VaultNotificationArgs(
                sns_topic=aws_sns_topic.arn,
                events=[
                    "ArchiveRetrievalCompleted",
                    "InventoryRetrievalCompleted",
                ],
            ),
            access_policy=my_archive_policy_document.json,
            tags={
                "Test": "MyArchive",
            })
        ```

        ## Import

        Using `pulumi import`, import Glacier Vaults using the `name`. For example:

        ```sh
         $ pulumi import aws:glacier/vault:Vault archive my_archive
        ```

        :param str resource_name: The name of the resource.
        :param VaultArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VaultArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_policy: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notification: Optional[pulumi.Input[pulumi.InputType['VaultNotificationArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VaultArgs.__new__(VaultArgs)

            __props__.__dict__["access_policy"] = access_policy
            __props__.__dict__["name"] = name
            __props__.__dict__["notification"] = notification
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["location"] = None
            __props__.__dict__["tags_all"] = None
        super(Vault, __self__).__init__(
            'aws:glacier/vault:Vault',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_policy: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            location: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            notification: Optional[pulumi.Input[pulumi.InputType['VaultNotificationArgs']]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Vault':
        """
        Get an existing Vault resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_policy: The policy document. This is a JSON formatted string.
               The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
        :param pulumi.Input[str] arn: The ARN of the vault.
        :param pulumi.Input[str] location: The URI of the vault that was created.
        :param pulumi.Input[str] name: The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
        :param pulumi.Input[pulumi.InputType['VaultNotificationArgs']] notification: The notifications for the Vault. Fields documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VaultState.__new__(_VaultState)

        __props__.__dict__["access_policy"] = access_policy
        __props__.__dict__["arn"] = arn
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["notification"] = notification
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Vault(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessPolicy")
    def access_policy(self) -> pulumi.Output[Optional[str]]:
        """
        The policy document. This is a JSON formatted string.
        The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
        """
        return pulumi.get(self, "access_policy")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the vault.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The URI of the vault that was created.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def notification(self) -> pulumi.Output[Optional['outputs.VaultNotification']]:
        """
        The notifications for the Vault. Fields documented below.
        """
        return pulumi.get(self, "notification")

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
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

