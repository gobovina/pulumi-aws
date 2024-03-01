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

__all__ = ['PhoneNumberArgs', 'PhoneNumber']

@pulumi.input_type
class PhoneNumberArgs:
    def __init__(__self__, *,
                 country_code: pulumi.Input[str],
                 target_arn: pulumi.Input[str],
                 type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a PhoneNumber resource.
        :param pulumi.Input[str] country_code: The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
        :param pulumi.Input[str] target_arn: The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
        :param pulumi.Input[str] type: The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
        :param pulumi.Input[str] description: The description of the phone number.
        :param pulumi.Input[str] prefix: The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Phone Number. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "country_code", country_code)
        pulumi.set(__self__, "target_arn", target_arn)
        pulumi.set(__self__, "type", type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if prefix is not None:
            pulumi.set(__self__, "prefix", prefix)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> pulumi.Input[str]:
        """
        The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
        """
        return pulumi.get(self, "country_code")

    @country_code.setter
    def country_code(self, value: pulumi.Input[str]):
        pulumi.set(self, "country_code", value)

    @property
    @pulumi.getter(name="targetArn")
    def target_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
        """
        return pulumi.get(self, "target_arn")

    @target_arn.setter
    def target_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "target_arn", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the phone number.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def prefix(self) -> Optional[pulumi.Input[str]]:
        """
        The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
        """
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prefix", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Tags to apply to the Phone Number. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _PhoneNumberState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 country_code: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 phone_number: Optional[pulumi.Input[str]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 statuses: Optional[pulumi.Input[Sequence[pulumi.Input['PhoneNumberStatusArgs']]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 target_arn: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PhoneNumber resources.
        :param pulumi.Input[str] arn: The ARN of the phone number.
        :param pulumi.Input[str] country_code: The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
        :param pulumi.Input[str] description: The description of the phone number.
        :param pulumi.Input[str] phone_number: The phone number. Phone numbers are formatted `[+] [country code] [subscriber number including area code]`.
        :param pulumi.Input[str] prefix: The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
        :param pulumi.Input[Sequence[pulumi.Input['PhoneNumberStatusArgs']]] statuses: The status of the phone number. Valid Values: `CLAIMED` | `IN_PROGRESS` | `FAILED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Phone Number. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] target_arn: The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
        :param pulumi.Input[str] type: The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if country_code is not None:
            pulumi.set(__self__, "country_code", country_code)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if phone_number is not None:
            pulumi.set(__self__, "phone_number", phone_number)
        if prefix is not None:
            pulumi.set(__self__, "prefix", prefix)
        if statuses is not None:
            pulumi.set(__self__, "statuses", statuses)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if target_arn is not None:
            pulumi.set(__self__, "target_arn", target_arn)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the phone number.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> Optional[pulumi.Input[str]]:
        """
        The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
        """
        return pulumi.get(self, "country_code")

    @country_code.setter
    def country_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "country_code", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the phone number.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="phoneNumber")
    def phone_number(self) -> Optional[pulumi.Input[str]]:
        """
        The phone number. Phone numbers are formatted `[+] [country code] [subscriber number including area code]`.
        """
        return pulumi.get(self, "phone_number")

    @phone_number.setter
    def phone_number(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "phone_number", value)

    @property
    @pulumi.getter
    def prefix(self) -> Optional[pulumi.Input[str]]:
        """
        The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
        """
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prefix", value)

    @property
    @pulumi.getter
    def statuses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PhoneNumberStatusArgs']]]]:
        """
        The status of the phone number. Valid Values: `CLAIMED` | `IN_PROGRESS` | `FAILED`.
        """
        return pulumi.get(self, "statuses")

    @statuses.setter
    def statuses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PhoneNumberStatusArgs']]]]):
        pulumi.set(self, "statuses", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Tags to apply to the Phone Number. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter(name="targetArn")
    def target_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
        """
        return pulumi.get(self, "target_arn")

    @target_arn.setter
    def target_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target_arn", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class PhoneNumber(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 country_code: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 target_arn: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Amazon Connect Phone Number resource. For more information see
        [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)

        ## Example Usage
        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.connect.PhoneNumber("example",
            target_arn=example_aws_connect_instance["arn"],
            country_code="US",
            type="DID",
            tags={
                "hello": "world",
            })
        ```
        ### Description

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.connect.PhoneNumber("example",
            target_arn=example_aws_connect_instance["arn"],
            country_code="US",
            type="DID",
            description="example description")
        ```
        ### Prefix to filter phone numbers

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.connect.PhoneNumber("example",
            target_arn=example_aws_connect_instance["arn"],
            country_code="US",
            type="DID",
            prefix="+18005")
        ```

        ## Import

        Using `pulumi import`, import Amazon Connect Phone Numbers using its `id`. For example:

        ```sh
         $ pulumi import aws:connect/phoneNumber:PhoneNumber example 12345678-abcd-1234-efgh-9876543210ab
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] country_code: The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
        :param pulumi.Input[str] description: The description of the phone number.
        :param pulumi.Input[str] prefix: The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Phone Number. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] target_arn: The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
        :param pulumi.Input[str] type: The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PhoneNumberArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Amazon Connect Phone Number resource. For more information see
        [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)

        ## Example Usage
        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.connect.PhoneNumber("example",
            target_arn=example_aws_connect_instance["arn"],
            country_code="US",
            type="DID",
            tags={
                "hello": "world",
            })
        ```
        ### Description

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.connect.PhoneNumber("example",
            target_arn=example_aws_connect_instance["arn"],
            country_code="US",
            type="DID",
            description="example description")
        ```
        ### Prefix to filter phone numbers

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.connect.PhoneNumber("example",
            target_arn=example_aws_connect_instance["arn"],
            country_code="US",
            type="DID",
            prefix="+18005")
        ```

        ## Import

        Using `pulumi import`, import Amazon Connect Phone Numbers using its `id`. For example:

        ```sh
         $ pulumi import aws:connect/phoneNumber:PhoneNumber example 12345678-abcd-1234-efgh-9876543210ab
        ```

        :param str resource_name: The name of the resource.
        :param PhoneNumberArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PhoneNumberArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 country_code: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 target_arn: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PhoneNumberArgs.__new__(PhoneNumberArgs)

            if country_code is None and not opts.urn:
                raise TypeError("Missing required property 'country_code'")
            __props__.__dict__["country_code"] = country_code
            __props__.__dict__["description"] = description
            __props__.__dict__["prefix"] = prefix
            __props__.__dict__["tags"] = tags
            if target_arn is None and not opts.urn:
                raise TypeError("Missing required property 'target_arn'")
            __props__.__dict__["target_arn"] = target_arn
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["arn"] = None
            __props__.__dict__["phone_number"] = None
            __props__.__dict__["statuses"] = None
            __props__.__dict__["tags_all"] = None
        super(PhoneNumber, __self__).__init__(
            'aws:connect/phoneNumber:PhoneNumber',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            country_code: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            phone_number: Optional[pulumi.Input[str]] = None,
            prefix: Optional[pulumi.Input[str]] = None,
            statuses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PhoneNumberStatusArgs']]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            target_arn: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'PhoneNumber':
        """
        Get an existing PhoneNumber resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the phone number.
        :param pulumi.Input[str] country_code: The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
        :param pulumi.Input[str] description: The description of the phone number.
        :param pulumi.Input[str] phone_number: The phone number. Phone numbers are formatted `[+] [country code] [subscriber number including area code]`.
        :param pulumi.Input[str] prefix: The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PhoneNumberStatusArgs']]]] statuses: The status of the phone number. Valid Values: `CLAIMED` | `IN_PROGRESS` | `FAILED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Phone Number. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] target_arn: The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
        :param pulumi.Input[str] type: The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PhoneNumberState.__new__(_PhoneNumberState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["country_code"] = country_code
        __props__.__dict__["description"] = description
        __props__.__dict__["phone_number"] = phone_number
        __props__.__dict__["prefix"] = prefix
        __props__.__dict__["statuses"] = statuses
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["target_arn"] = target_arn
        __props__.__dict__["type"] = type
        return PhoneNumber(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the phone number.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> pulumi.Output[str]:
        """
        The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
        """
        return pulumi.get(self, "country_code")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the phone number.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="phoneNumber")
    def phone_number(self) -> pulumi.Output[str]:
        """
        The phone number. Phone numbers are formatted `[+] [country code] [subscriber number including area code]`.
        """
        return pulumi.get(self, "phone_number")

    @property
    @pulumi.getter
    def prefix(self) -> pulumi.Output[Optional[str]]:
        """
        The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
        """
        return pulumi.get(self, "prefix")

    @property
    @pulumi.getter
    def statuses(self) -> pulumi.Output[Sequence['outputs.PhoneNumberStatus']]:
        """
        The status of the phone number. Valid Values: `CLAIMED` | `IN_PROGRESS` | `FAILED`.
        """
        return pulumi.get(self, "statuses")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Tags to apply to the Phone Number. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter(name="targetArn")
    def target_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
        """
        return pulumi.get(self, "target_arn")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
        """
        return pulumi.get(self, "type")

