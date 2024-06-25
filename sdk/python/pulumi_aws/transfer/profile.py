# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['ProfileArgs', 'Profile']

@pulumi.input_type
class ProfileArgs:
    def __init__(__self__, *,
                 as2_id: pulumi.Input[str],
                 profile_type: pulumi.Input[str],
                 certificate_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Profile resource.
        :param pulumi.Input[str] as2_id: The As2Id is the AS2 name as defined in the RFC 4130. For inbound ttransfers this is the AS2 From Header for the AS2 messages sent from the partner. For Outbound messages this is the AS2 To Header for the AS2 messages sent to the partner. his ID cannot include spaces.
        :param pulumi.Input[str] profile_type: The profile type should be LOCAL or PARTNER.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] certificate_ids: The list of certificate Ids from the imported certificate operation.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "as2_id", as2_id)
        pulumi.set(__self__, "profile_type", profile_type)
        if certificate_ids is not None:
            pulumi.set(__self__, "certificate_ids", certificate_ids)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="as2Id")
    def as2_id(self) -> pulumi.Input[str]:
        """
        The As2Id is the AS2 name as defined in the RFC 4130. For inbound ttransfers this is the AS2 From Header for the AS2 messages sent from the partner. For Outbound messages this is the AS2 To Header for the AS2 messages sent to the partner. his ID cannot include spaces.
        """
        return pulumi.get(self, "as2_id")

    @as2_id.setter
    def as2_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "as2_id", value)

    @property
    @pulumi.getter(name="profileType")
    def profile_type(self) -> pulumi.Input[str]:
        """
        The profile type should be LOCAL or PARTNER.
        """
        return pulumi.get(self, "profile_type")

    @profile_type.setter
    def profile_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "profile_type", value)

    @property
    @pulumi.getter(name="certificateIds")
    def certificate_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of certificate Ids from the imported certificate operation.
        """
        return pulumi.get(self, "certificate_ids")

    @certificate_ids.setter
    def certificate_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "certificate_ids", value)

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
class _ProfileState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 as2_id: Optional[pulumi.Input[str]] = None,
                 certificate_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 profile_id: Optional[pulumi.Input[str]] = None,
                 profile_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Profile resources.
        :param pulumi.Input[str] arn: The ARN of the profile.
        :param pulumi.Input[str] as2_id: The As2Id is the AS2 name as defined in the RFC 4130. For inbound ttransfers this is the AS2 From Header for the AS2 messages sent from the partner. For Outbound messages this is the AS2 To Header for the AS2 messages sent to the partner. his ID cannot include spaces.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] certificate_ids: The list of certificate Ids from the imported certificate operation.
        :param pulumi.Input[str] profile_id: The unique identifier for the AS2 profile.
        :param pulumi.Input[str] profile_type: The profile type should be LOCAL or PARTNER.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if as2_id is not None:
            pulumi.set(__self__, "as2_id", as2_id)
        if certificate_ids is not None:
            pulumi.set(__self__, "certificate_ids", certificate_ids)
        if profile_id is not None:
            pulumi.set(__self__, "profile_id", profile_id)
        if profile_type is not None:
            pulumi.set(__self__, "profile_type", profile_type)
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
        The ARN of the profile.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="as2Id")
    def as2_id(self) -> Optional[pulumi.Input[str]]:
        """
        The As2Id is the AS2 name as defined in the RFC 4130. For inbound ttransfers this is the AS2 From Header for the AS2 messages sent from the partner. For Outbound messages this is the AS2 To Header for the AS2 messages sent to the partner. his ID cannot include spaces.
        """
        return pulumi.get(self, "as2_id")

    @as2_id.setter
    def as2_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "as2_id", value)

    @property
    @pulumi.getter(name="certificateIds")
    def certificate_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of certificate Ids from the imported certificate operation.
        """
        return pulumi.get(self, "certificate_ids")

    @certificate_ids.setter
    def certificate_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "certificate_ids", value)

    @property
    @pulumi.getter(name="profileId")
    def profile_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for the AS2 profile.
        """
        return pulumi.get(self, "profile_id")

    @profile_id.setter
    def profile_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "profile_id", value)

    @property
    @pulumi.getter(name="profileType")
    def profile_type(self) -> Optional[pulumi.Input[str]]:
        """
        The profile type should be LOCAL or PARTNER.
        """
        return pulumi.get(self, "profile_type")

    @profile_type.setter
    def profile_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "profile_type", value)

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
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class Profile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 as2_id: Optional[pulumi.Input[str]] = None,
                 certificate_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 profile_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a AWS Transfer AS2 Profile resource.

        ## Example Usage

        ## Import

        Using `pulumi import`, import Transfer AS2 Profile using the `profile_id`. For example:

        ```sh
        $ pulumi import aws:transfer/profile:Profile example p-4221a88afd5f4362a
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] as2_id: The As2Id is the AS2 name as defined in the RFC 4130. For inbound ttransfers this is the AS2 From Header for the AS2 messages sent from the partner. For Outbound messages this is the AS2 To Header for the AS2 messages sent to the partner. his ID cannot include spaces.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] certificate_ids: The list of certificate Ids from the imported certificate operation.
        :param pulumi.Input[str] profile_type: The profile type should be LOCAL or PARTNER.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProfileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a AWS Transfer AS2 Profile resource.

        ## Example Usage

        ## Import

        Using `pulumi import`, import Transfer AS2 Profile using the `profile_id`. For example:

        ```sh
        $ pulumi import aws:transfer/profile:Profile example p-4221a88afd5f4362a
        ```

        :param str resource_name: The name of the resource.
        :param ProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 as2_id: Optional[pulumi.Input[str]] = None,
                 certificate_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 profile_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProfileArgs.__new__(ProfileArgs)

            if as2_id is None and not opts.urn:
                raise TypeError("Missing required property 'as2_id'")
            __props__.__dict__["as2_id"] = as2_id
            __props__.__dict__["certificate_ids"] = certificate_ids
            if profile_type is None and not opts.urn:
                raise TypeError("Missing required property 'profile_type'")
            __props__.__dict__["profile_type"] = profile_type
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["profile_id"] = None
            __props__.__dict__["tags_all"] = None
        super(Profile, __self__).__init__(
            'aws:transfer/profile:Profile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            as2_id: Optional[pulumi.Input[str]] = None,
            certificate_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            profile_id: Optional[pulumi.Input[str]] = None,
            profile_type: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Profile':
        """
        Get an existing Profile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the profile.
        :param pulumi.Input[str] as2_id: The As2Id is the AS2 name as defined in the RFC 4130. For inbound ttransfers this is the AS2 From Header for the AS2 messages sent from the partner. For Outbound messages this is the AS2 To Header for the AS2 messages sent to the partner. his ID cannot include spaces.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] certificate_ids: The list of certificate Ids from the imported certificate operation.
        :param pulumi.Input[str] profile_id: The unique identifier for the AS2 profile.
        :param pulumi.Input[str] profile_type: The profile type should be LOCAL or PARTNER.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProfileState.__new__(_ProfileState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["as2_id"] = as2_id
        __props__.__dict__["certificate_ids"] = certificate_ids
        __props__.__dict__["profile_id"] = profile_id
        __props__.__dict__["profile_type"] = profile_type
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Profile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the profile.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="as2Id")
    def as2_id(self) -> pulumi.Output[str]:
        """
        The As2Id is the AS2 name as defined in the RFC 4130. For inbound ttransfers this is the AS2 From Header for the AS2 messages sent from the partner. For Outbound messages this is the AS2 To Header for the AS2 messages sent to the partner. his ID cannot include spaces.
        """
        return pulumi.get(self, "as2_id")

    @property
    @pulumi.getter(name="certificateIds")
    def certificate_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The list of certificate Ids from the imported certificate operation.
        """
        return pulumi.get(self, "certificate_ids")

    @property
    @pulumi.getter(name="profileId")
    def profile_id(self) -> pulumi.Output[str]:
        """
        The unique identifier for the AS2 profile.
        """
        return pulumi.get(self, "profile_id")

    @property
    @pulumi.getter(name="profileType")
    def profile_type(self) -> pulumi.Output[str]:
        """
        The profile type should be LOCAL or PARTNER.
        """
        return pulumi.get(self, "profile_type")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        return pulumi.get(self, "tags_all")

