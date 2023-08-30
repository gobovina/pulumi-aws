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

__all__ = ['BotAliasArgs', 'BotAlias']

@pulumi.input_type
class BotAliasArgs:
    def __init__(__self__, *,
                 bot_name: pulumi.Input[str],
                 bot_version: pulumi.Input[str],
                 conversation_logs: Optional[pulumi.Input['BotAliasConversationLogsArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BotAlias resource.
        :param pulumi.Input[str] bot_name: The name of the bot.
        :param pulumi.Input[str] bot_version: The name of the bot.
        :param pulumi.Input['BotAliasConversationLogsArgs'] conversation_logs: The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
        :param pulumi.Input[str] description: A description of the alias. Must be less than or equal to 200 characters in length.
        :param pulumi.Input[str] name: The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
        """
        pulumi.set(__self__, "bot_name", bot_name)
        pulumi.set(__self__, "bot_version", bot_version)
        if conversation_logs is not None:
            pulumi.set(__self__, "conversation_logs", conversation_logs)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="botName")
    def bot_name(self) -> pulumi.Input[str]:
        """
        The name of the bot.
        """
        return pulumi.get(self, "bot_name")

    @bot_name.setter
    def bot_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "bot_name", value)

    @property
    @pulumi.getter(name="botVersion")
    def bot_version(self) -> pulumi.Input[str]:
        """
        The name of the bot.
        """
        return pulumi.get(self, "bot_version")

    @bot_version.setter
    def bot_version(self, value: pulumi.Input[str]):
        pulumi.set(self, "bot_version", value)

    @property
    @pulumi.getter(name="conversationLogs")
    def conversation_logs(self) -> Optional[pulumi.Input['BotAliasConversationLogsArgs']]:
        """
        The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
        """
        return pulumi.get(self, "conversation_logs")

    @conversation_logs.setter
    def conversation_logs(self, value: Optional[pulumi.Input['BotAliasConversationLogsArgs']]):
        pulumi.set(self, "conversation_logs", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the alias. Must be less than or equal to 200 characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _BotAliasState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 bot_name: Optional[pulumi.Input[str]] = None,
                 bot_version: Optional[pulumi.Input[str]] = None,
                 checksum: Optional[pulumi.Input[str]] = None,
                 conversation_logs: Optional[pulumi.Input['BotAliasConversationLogsArgs']] = None,
                 created_date: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 last_updated_date: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BotAlias resources.
        :param pulumi.Input[str] arn: The ARN of the bot alias.
        :param pulumi.Input[str] bot_name: The name of the bot.
        :param pulumi.Input[str] bot_version: The name of the bot.
        :param pulumi.Input[str] checksum: Checksum of the bot alias.
        :param pulumi.Input['BotAliasConversationLogsArgs'] conversation_logs: The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
        :param pulumi.Input[str] created_date: The date that the bot alias was created.
        :param pulumi.Input[str] description: A description of the alias. Must be less than or equal to 200 characters in length.
        :param pulumi.Input[str] last_updated_date: The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
        :param pulumi.Input[str] name: The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if bot_name is not None:
            pulumi.set(__self__, "bot_name", bot_name)
        if bot_version is not None:
            pulumi.set(__self__, "bot_version", bot_version)
        if checksum is not None:
            pulumi.set(__self__, "checksum", checksum)
        if conversation_logs is not None:
            pulumi.set(__self__, "conversation_logs", conversation_logs)
        if created_date is not None:
            pulumi.set(__self__, "created_date", created_date)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if last_updated_date is not None:
            pulumi.set(__self__, "last_updated_date", last_updated_date)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the bot alias.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="botName")
    def bot_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the bot.
        """
        return pulumi.get(self, "bot_name")

    @bot_name.setter
    def bot_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bot_name", value)

    @property
    @pulumi.getter(name="botVersion")
    def bot_version(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the bot.
        """
        return pulumi.get(self, "bot_version")

    @bot_version.setter
    def bot_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bot_version", value)

    @property
    @pulumi.getter
    def checksum(self) -> Optional[pulumi.Input[str]]:
        """
        Checksum of the bot alias.
        """
        return pulumi.get(self, "checksum")

    @checksum.setter
    def checksum(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "checksum", value)

    @property
    @pulumi.getter(name="conversationLogs")
    def conversation_logs(self) -> Optional[pulumi.Input['BotAliasConversationLogsArgs']]:
        """
        The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
        """
        return pulumi.get(self, "conversation_logs")

    @conversation_logs.setter
    def conversation_logs(self, value: Optional[pulumi.Input['BotAliasConversationLogsArgs']]):
        pulumi.set(self, "conversation_logs", value)

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date that the bot alias was created.
        """
        return pulumi.get(self, "created_date")

    @created_date.setter
    def created_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_date", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the alias. Must be less than or equal to 200 characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
        """
        return pulumi.get(self, "last_updated_date")

    @last_updated_date.setter
    def last_updated_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_updated_date", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class BotAlias(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bot_name: Optional[pulumi.Input[str]] = None,
                 bot_version: Optional[pulumi.Input[str]] = None,
                 conversation_logs: Optional[pulumi.Input[pulumi.InputType['BotAliasConversationLogsArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Amazon Lex Bot Alias resource. For more information see
        [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        order_flowers_prod = aws.lex.BotAlias("orderFlowersProd",
            bot_name="OrderFlowers",
            bot_version="1",
            description="Production Version of the OrderFlowers Bot.",
            name="OrderFlowersProd")
        ```

        ## Import

        Using `pulumi import`, import bot aliases using an ID with the format `bot_name:bot_alias_name`. For example:

        ```sh
         $ pulumi import aws:lex/botAlias:BotAlias order_flowers_prod OrderFlowers:OrderFlowersProd
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bot_name: The name of the bot.
        :param pulumi.Input[str] bot_version: The name of the bot.
        :param pulumi.Input[pulumi.InputType['BotAliasConversationLogsArgs']] conversation_logs: The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
        :param pulumi.Input[str] description: A description of the alias. Must be less than or equal to 200 characters in length.
        :param pulumi.Input[str] name: The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BotAliasArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Amazon Lex Bot Alias resource. For more information see
        [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        order_flowers_prod = aws.lex.BotAlias("orderFlowersProd",
            bot_name="OrderFlowers",
            bot_version="1",
            description="Production Version of the OrderFlowers Bot.",
            name="OrderFlowersProd")
        ```

        ## Import

        Using `pulumi import`, import bot aliases using an ID with the format `bot_name:bot_alias_name`. For example:

        ```sh
         $ pulumi import aws:lex/botAlias:BotAlias order_flowers_prod OrderFlowers:OrderFlowersProd
        ```

        :param str resource_name: The name of the resource.
        :param BotAliasArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BotAliasArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bot_name: Optional[pulumi.Input[str]] = None,
                 bot_version: Optional[pulumi.Input[str]] = None,
                 conversation_logs: Optional[pulumi.Input[pulumi.InputType['BotAliasConversationLogsArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BotAliasArgs.__new__(BotAliasArgs)

            if bot_name is None and not opts.urn:
                raise TypeError("Missing required property 'bot_name'")
            __props__.__dict__["bot_name"] = bot_name
            if bot_version is None and not opts.urn:
                raise TypeError("Missing required property 'bot_version'")
            __props__.__dict__["bot_version"] = bot_version
            __props__.__dict__["conversation_logs"] = conversation_logs
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["arn"] = None
            __props__.__dict__["checksum"] = None
            __props__.__dict__["created_date"] = None
            __props__.__dict__["last_updated_date"] = None
        super(BotAlias, __self__).__init__(
            'aws:lex/botAlias:BotAlias',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            bot_name: Optional[pulumi.Input[str]] = None,
            bot_version: Optional[pulumi.Input[str]] = None,
            checksum: Optional[pulumi.Input[str]] = None,
            conversation_logs: Optional[pulumi.Input[pulumi.InputType['BotAliasConversationLogsArgs']]] = None,
            created_date: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            last_updated_date: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'BotAlias':
        """
        Get an existing BotAlias resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the bot alias.
        :param pulumi.Input[str] bot_name: The name of the bot.
        :param pulumi.Input[str] bot_version: The name of the bot.
        :param pulumi.Input[str] checksum: Checksum of the bot alias.
        :param pulumi.Input[pulumi.InputType['BotAliasConversationLogsArgs']] conversation_logs: The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
        :param pulumi.Input[str] created_date: The date that the bot alias was created.
        :param pulumi.Input[str] description: A description of the alias. Must be less than or equal to 200 characters in length.
        :param pulumi.Input[str] last_updated_date: The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
        :param pulumi.Input[str] name: The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BotAliasState.__new__(_BotAliasState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["bot_name"] = bot_name
        __props__.__dict__["bot_version"] = bot_version
        __props__.__dict__["checksum"] = checksum
        __props__.__dict__["conversation_logs"] = conversation_logs
        __props__.__dict__["created_date"] = created_date
        __props__.__dict__["description"] = description
        __props__.__dict__["last_updated_date"] = last_updated_date
        __props__.__dict__["name"] = name
        return BotAlias(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the bot alias.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="botName")
    def bot_name(self) -> pulumi.Output[str]:
        """
        The name of the bot.
        """
        return pulumi.get(self, "bot_name")

    @property
    @pulumi.getter(name="botVersion")
    def bot_version(self) -> pulumi.Output[str]:
        """
        The name of the bot.
        """
        return pulumi.get(self, "bot_version")

    @property
    @pulumi.getter
    def checksum(self) -> pulumi.Output[str]:
        """
        Checksum of the bot alias.
        """
        return pulumi.get(self, "checksum")

    @property
    @pulumi.getter(name="conversationLogs")
    def conversation_logs(self) -> pulumi.Output[Optional['outputs.BotAliasConversationLogs']]:
        """
        The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
        """
        return pulumi.get(self, "conversation_logs")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> pulumi.Output[str]:
        """
        The date that the bot alias was created.
        """
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A description of the alias. Must be less than or equal to 200 characters in length.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> pulumi.Output[str]:
        """
        The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
        """
        return pulumi.get(self, "last_updated_date")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
        """
        return pulumi.get(self, "name")

