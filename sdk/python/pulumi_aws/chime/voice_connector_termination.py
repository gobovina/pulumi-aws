# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VoiceConnectorTerminationArgs', 'VoiceConnectorTermination']

@pulumi.input_type
class VoiceConnectorTerminationArgs:
    def __init__(__self__, *,
                 calling_regions: pulumi.Input[Sequence[pulumi.Input[str]]],
                 cidr_allow_lists: pulumi.Input[Sequence[pulumi.Input[str]]],
                 voice_connector_id: pulumi.Input[str],
                 cps_limit: Optional[pulumi.Input[int]] = None,
                 default_phone_number: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a VoiceConnectorTermination resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] calling_regions: The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cidr_allow_lists: The IP addresses allowed to make calls, in CIDR format.
        :param pulumi.Input[str] voice_connector_id: The Amazon Chime Voice Connector ID.
        :param pulumi.Input[int] cps_limit: The limit on calls per second. Max value based on account service quota. Default value of `1`.
        :param pulumi.Input[str] default_phone_number: The default caller ID phone number.
        :param pulumi.Input[bool] disabled: When termination settings are disabled, outbound calls can not be made.
        """
        pulumi.set(__self__, "calling_regions", calling_regions)
        pulumi.set(__self__, "cidr_allow_lists", cidr_allow_lists)
        pulumi.set(__self__, "voice_connector_id", voice_connector_id)
        if cps_limit is not None:
            pulumi.set(__self__, "cps_limit", cps_limit)
        if default_phone_number is not None:
            pulumi.set(__self__, "default_phone_number", default_phone_number)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)

    @property
    @pulumi.getter(name="callingRegions")
    def calling_regions(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
        """
        return pulumi.get(self, "calling_regions")

    @calling_regions.setter
    def calling_regions(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "calling_regions", value)

    @property
    @pulumi.getter(name="cidrAllowLists")
    def cidr_allow_lists(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The IP addresses allowed to make calls, in CIDR format.
        """
        return pulumi.get(self, "cidr_allow_lists")

    @cidr_allow_lists.setter
    def cidr_allow_lists(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "cidr_allow_lists", value)

    @property
    @pulumi.getter(name="voiceConnectorId")
    def voice_connector_id(self) -> pulumi.Input[str]:
        """
        The Amazon Chime Voice Connector ID.
        """
        return pulumi.get(self, "voice_connector_id")

    @voice_connector_id.setter
    def voice_connector_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "voice_connector_id", value)

    @property
    @pulumi.getter(name="cpsLimit")
    def cps_limit(self) -> Optional[pulumi.Input[int]]:
        """
        The limit on calls per second. Max value based on account service quota. Default value of `1`.
        """
        return pulumi.get(self, "cps_limit")

    @cps_limit.setter
    def cps_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cps_limit", value)

    @property
    @pulumi.getter(name="defaultPhoneNumber")
    def default_phone_number(self) -> Optional[pulumi.Input[str]]:
        """
        The default caller ID phone number.
        """
        return pulumi.get(self, "default_phone_number")

    @default_phone_number.setter
    def default_phone_number(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_phone_number", value)

    @property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        When termination settings are disabled, outbound calls can not be made.
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disabled", value)


@pulumi.input_type
class _VoiceConnectorTerminationState:
    def __init__(__self__, *,
                 calling_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 cidr_allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 cps_limit: Optional[pulumi.Input[int]] = None,
                 default_phone_number: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 voice_connector_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VoiceConnectorTermination resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] calling_regions: The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cidr_allow_lists: The IP addresses allowed to make calls, in CIDR format.
        :param pulumi.Input[int] cps_limit: The limit on calls per second. Max value based on account service quota. Default value of `1`.
        :param pulumi.Input[str] default_phone_number: The default caller ID phone number.
        :param pulumi.Input[bool] disabled: When termination settings are disabled, outbound calls can not be made.
        :param pulumi.Input[str] voice_connector_id: The Amazon Chime Voice Connector ID.
        """
        if calling_regions is not None:
            pulumi.set(__self__, "calling_regions", calling_regions)
        if cidr_allow_lists is not None:
            pulumi.set(__self__, "cidr_allow_lists", cidr_allow_lists)
        if cps_limit is not None:
            pulumi.set(__self__, "cps_limit", cps_limit)
        if default_phone_number is not None:
            pulumi.set(__self__, "default_phone_number", default_phone_number)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if voice_connector_id is not None:
            pulumi.set(__self__, "voice_connector_id", voice_connector_id)

    @property
    @pulumi.getter(name="callingRegions")
    def calling_regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
        """
        return pulumi.get(self, "calling_regions")

    @calling_regions.setter
    def calling_regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "calling_regions", value)

    @property
    @pulumi.getter(name="cidrAllowLists")
    def cidr_allow_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The IP addresses allowed to make calls, in CIDR format.
        """
        return pulumi.get(self, "cidr_allow_lists")

    @cidr_allow_lists.setter
    def cidr_allow_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "cidr_allow_lists", value)

    @property
    @pulumi.getter(name="cpsLimit")
    def cps_limit(self) -> Optional[pulumi.Input[int]]:
        """
        The limit on calls per second. Max value based on account service quota. Default value of `1`.
        """
        return pulumi.get(self, "cps_limit")

    @cps_limit.setter
    def cps_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cps_limit", value)

    @property
    @pulumi.getter(name="defaultPhoneNumber")
    def default_phone_number(self) -> Optional[pulumi.Input[str]]:
        """
        The default caller ID phone number.
        """
        return pulumi.get(self, "default_phone_number")

    @default_phone_number.setter
    def default_phone_number(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_phone_number", value)

    @property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        When termination settings are disabled, outbound calls can not be made.
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disabled", value)

    @property
    @pulumi.getter(name="voiceConnectorId")
    def voice_connector_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Chime Voice Connector ID.
        """
        return pulumi.get(self, "voice_connector_id")

    @voice_connector_id.setter
    def voice_connector_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "voice_connector_id", value)


class VoiceConnectorTermination(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 calling_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 cidr_allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 cps_limit: Optional[pulumi.Input[int]] = None,
                 default_phone_number: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 voice_connector_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Enable Termination settings to control outbound calling from your SIP infrastructure.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.chime.VoiceConnector("default",
            name="vc-name-test",
            require_encryption=True)
        default_voice_connector_termination = aws.chime.VoiceConnectorTermination("default",
            disabled=False,
            cps_limit=1,
            cidr_allow_lists=["50.35.78.96/31"],
            calling_regions=[
                "US",
                "CA",
            ],
            voice_connector_id=default.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Chime Voice Connector Termination using the `voice_connector_id`. For example:

        ```sh
        $ pulumi import aws:chime/voiceConnectorTermination:VoiceConnectorTermination default abcdef1ghij2klmno3pqr4
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] calling_regions: The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cidr_allow_lists: The IP addresses allowed to make calls, in CIDR format.
        :param pulumi.Input[int] cps_limit: The limit on calls per second. Max value based on account service quota. Default value of `1`.
        :param pulumi.Input[str] default_phone_number: The default caller ID phone number.
        :param pulumi.Input[bool] disabled: When termination settings are disabled, outbound calls can not be made.
        :param pulumi.Input[str] voice_connector_id: The Amazon Chime Voice Connector ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VoiceConnectorTerminationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Enable Termination settings to control outbound calling from your SIP infrastructure.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.chime.VoiceConnector("default",
            name="vc-name-test",
            require_encryption=True)
        default_voice_connector_termination = aws.chime.VoiceConnectorTermination("default",
            disabled=False,
            cps_limit=1,
            cidr_allow_lists=["50.35.78.96/31"],
            calling_regions=[
                "US",
                "CA",
            ],
            voice_connector_id=default.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Chime Voice Connector Termination using the `voice_connector_id`. For example:

        ```sh
        $ pulumi import aws:chime/voiceConnectorTermination:VoiceConnectorTermination default abcdef1ghij2klmno3pqr4
        ```

        :param str resource_name: The name of the resource.
        :param VoiceConnectorTerminationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VoiceConnectorTerminationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 calling_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 cidr_allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 cps_limit: Optional[pulumi.Input[int]] = None,
                 default_phone_number: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 voice_connector_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VoiceConnectorTerminationArgs.__new__(VoiceConnectorTerminationArgs)

            if calling_regions is None and not opts.urn:
                raise TypeError("Missing required property 'calling_regions'")
            __props__.__dict__["calling_regions"] = calling_regions
            if cidr_allow_lists is None and not opts.urn:
                raise TypeError("Missing required property 'cidr_allow_lists'")
            __props__.__dict__["cidr_allow_lists"] = cidr_allow_lists
            __props__.__dict__["cps_limit"] = cps_limit
            __props__.__dict__["default_phone_number"] = default_phone_number
            __props__.__dict__["disabled"] = disabled
            if voice_connector_id is None and not opts.urn:
                raise TypeError("Missing required property 'voice_connector_id'")
            __props__.__dict__["voice_connector_id"] = voice_connector_id
        super(VoiceConnectorTermination, __self__).__init__(
            'aws:chime/voiceConnectorTermination:VoiceConnectorTermination',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            calling_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            cidr_allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            cps_limit: Optional[pulumi.Input[int]] = None,
            default_phone_number: Optional[pulumi.Input[str]] = None,
            disabled: Optional[pulumi.Input[bool]] = None,
            voice_connector_id: Optional[pulumi.Input[str]] = None) -> 'VoiceConnectorTermination':
        """
        Get an existing VoiceConnectorTermination resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] calling_regions: The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cidr_allow_lists: The IP addresses allowed to make calls, in CIDR format.
        :param pulumi.Input[int] cps_limit: The limit on calls per second. Max value based on account service quota. Default value of `1`.
        :param pulumi.Input[str] default_phone_number: The default caller ID phone number.
        :param pulumi.Input[bool] disabled: When termination settings are disabled, outbound calls can not be made.
        :param pulumi.Input[str] voice_connector_id: The Amazon Chime Voice Connector ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VoiceConnectorTerminationState.__new__(_VoiceConnectorTerminationState)

        __props__.__dict__["calling_regions"] = calling_regions
        __props__.__dict__["cidr_allow_lists"] = cidr_allow_lists
        __props__.__dict__["cps_limit"] = cps_limit
        __props__.__dict__["default_phone_number"] = default_phone_number
        __props__.__dict__["disabled"] = disabled
        __props__.__dict__["voice_connector_id"] = voice_connector_id
        return VoiceConnectorTermination(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="callingRegions")
    def calling_regions(self) -> pulumi.Output[Sequence[str]]:
        """
        The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
        """
        return pulumi.get(self, "calling_regions")

    @property
    @pulumi.getter(name="cidrAllowLists")
    def cidr_allow_lists(self) -> pulumi.Output[Sequence[str]]:
        """
        The IP addresses allowed to make calls, in CIDR format.
        """
        return pulumi.get(self, "cidr_allow_lists")

    @property
    @pulumi.getter(name="cpsLimit")
    def cps_limit(self) -> pulumi.Output[Optional[int]]:
        """
        The limit on calls per second. Max value based on account service quota. Default value of `1`.
        """
        return pulumi.get(self, "cps_limit")

    @property
    @pulumi.getter(name="defaultPhoneNumber")
    def default_phone_number(self) -> pulumi.Output[Optional[str]]:
        """
        The default caller ID phone number.
        """
        return pulumi.get(self, "default_phone_number")

    @property
    @pulumi.getter
    def disabled(self) -> pulumi.Output[Optional[bool]]:
        """
        When termination settings are disabled, outbound calls can not be made.
        """
        return pulumi.get(self, "disabled")

    @property
    @pulumi.getter(name="voiceConnectorId")
    def voice_connector_id(self) -> pulumi.Output[str]:
        """
        The Amazon Chime Voice Connector ID.
        """
        return pulumi.get(self, "voice_connector_id")

