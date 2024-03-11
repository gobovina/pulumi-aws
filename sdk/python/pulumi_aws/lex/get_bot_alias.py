# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetBotAliasResult',
    'AwaitableGetBotAliasResult',
    'get_bot_alias',
    'get_bot_alias_output',
]

@pulumi.output_type
class GetBotAliasResult:
    """
    A collection of values returned by getBotAlias.
    """
    def __init__(__self__, arn=None, bot_name=None, bot_version=None, checksum=None, created_date=None, description=None, id=None, last_updated_date=None, name=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if bot_name and not isinstance(bot_name, str):
            raise TypeError("Expected argument 'bot_name' to be a str")
        pulumi.set(__self__, "bot_name", bot_name)
        if bot_version and not isinstance(bot_version, str):
            raise TypeError("Expected argument 'bot_version' to be a str")
        pulumi.set(__self__, "bot_version", bot_version)
        if checksum and not isinstance(checksum, str):
            raise TypeError("Expected argument 'checksum' to be a str")
        pulumi.set(__self__, "checksum", checksum)
        if created_date and not isinstance(created_date, str):
            raise TypeError("Expected argument 'created_date' to be a str")
        pulumi.set(__self__, "created_date", created_date)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if last_updated_date and not isinstance(last_updated_date, str):
            raise TypeError("Expected argument 'last_updated_date' to be a str")
        pulumi.set(__self__, "last_updated_date", last_updated_date)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the bot alias.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="botName")
    def bot_name(self) -> str:
        """
        Name of the bot.
        """
        return pulumi.get(self, "bot_name")

    @property
    @pulumi.getter(name="botVersion")
    def bot_version(self) -> str:
        """
        Version of the bot that the alias points to.
        """
        return pulumi.get(self, "bot_version")

    @property
    @pulumi.getter
    def checksum(self) -> str:
        """
        Checksum of the bot alias.
        """
        return pulumi.get(self, "checksum")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> str:
        """
        Date that the bot alias was created.
        """
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the alias.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> str:
        """
        Date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
        """
        return pulumi.get(self, "last_updated_date")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the alias. The name is not case sensitive.
        """
        return pulumi.get(self, "name")


class AwaitableGetBotAliasResult(GetBotAliasResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBotAliasResult(
            arn=self.arn,
            bot_name=self.bot_name,
            bot_version=self.bot_version,
            checksum=self.checksum,
            created_date=self.created_date,
            description=self.description,
            id=self.id,
            last_updated_date=self.last_updated_date,
            name=self.name)


def get_bot_alias(bot_name: Optional[str] = None,
                  name: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBotAliasResult:
    """
    Provides details about a specific Amazon Lex Bot Alias.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    order_flowers_prod = aws.lex.get_bot_alias(bot_name="OrderFlowers",
        name="OrderFlowersProd")
    ```
    <!--End PulumiCodeChooser -->


    :param str bot_name: Name of the bot.
    :param str name: Name of the bot alias. The name is case sensitive.
    """
    __args__ = dict()
    __args__['botName'] = bot_name
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:lex/getBotAlias:getBotAlias', __args__, opts=opts, typ=GetBotAliasResult).value

    return AwaitableGetBotAliasResult(
        arn=pulumi.get(__ret__, 'arn'),
        bot_name=pulumi.get(__ret__, 'bot_name'),
        bot_version=pulumi.get(__ret__, 'bot_version'),
        checksum=pulumi.get(__ret__, 'checksum'),
        created_date=pulumi.get(__ret__, 'created_date'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        last_updated_date=pulumi.get(__ret__, 'last_updated_date'),
        name=pulumi.get(__ret__, 'name'))


@_utilities.lift_output_func(get_bot_alias)
def get_bot_alias_output(bot_name: Optional[pulumi.Input[str]] = None,
                         name: Optional[pulumi.Input[str]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBotAliasResult]:
    """
    Provides details about a specific Amazon Lex Bot Alias.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    order_flowers_prod = aws.lex.get_bot_alias(bot_name="OrderFlowers",
        name="OrderFlowersProd")
    ```
    <!--End PulumiCodeChooser -->


    :param str bot_name: Name of the bot.
    :param str name: Name of the bot alias. The name is case sensitive.
    """
    ...
