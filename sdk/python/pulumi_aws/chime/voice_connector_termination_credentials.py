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

__all__ = ['VoiceConnectorTerminationCredentialsArgs', 'VoiceConnectorTerminationCredentials']

@pulumi.input_type
class VoiceConnectorTerminationCredentialsArgs:
    def __init__(__self__, *,
                 credentials: pulumi.Input[Sequence[pulumi.Input['VoiceConnectorTerminationCredentialsCredentialArgs']]],
                 voice_connector_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a VoiceConnectorTerminationCredentials resource.
        :param pulumi.Input[Sequence[pulumi.Input['VoiceConnectorTerminationCredentialsCredentialArgs']]] credentials: List of termination SIP credentials.
        :param pulumi.Input[str] voice_connector_id: Amazon Chime Voice Connector ID.
        """
        pulumi.set(__self__, "credentials", credentials)
        pulumi.set(__self__, "voice_connector_id", voice_connector_id)

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Input[Sequence[pulumi.Input['VoiceConnectorTerminationCredentialsCredentialArgs']]]:
        """
        List of termination SIP credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: pulumi.Input[Sequence[pulumi.Input['VoiceConnectorTerminationCredentialsCredentialArgs']]]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="voiceConnectorId")
    def voice_connector_id(self) -> pulumi.Input[str]:
        """
        Amazon Chime Voice Connector ID.
        """
        return pulumi.get(self, "voice_connector_id")

    @voice_connector_id.setter
    def voice_connector_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "voice_connector_id", value)


@pulumi.input_type
class _VoiceConnectorTerminationCredentialsState:
    def __init__(__self__, *,
                 credentials: Optional[pulumi.Input[Sequence[pulumi.Input['VoiceConnectorTerminationCredentialsCredentialArgs']]]] = None,
                 voice_connector_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VoiceConnectorTerminationCredentials resources.
        :param pulumi.Input[Sequence[pulumi.Input['VoiceConnectorTerminationCredentialsCredentialArgs']]] credentials: List of termination SIP credentials.
        :param pulumi.Input[str] voice_connector_id: Amazon Chime Voice Connector ID.
        """
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if voice_connector_id is not None:
            pulumi.set(__self__, "voice_connector_id", voice_connector_id)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VoiceConnectorTerminationCredentialsCredentialArgs']]]]:
        """
        List of termination SIP credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VoiceConnectorTerminationCredentialsCredentialArgs']]]]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="voiceConnectorId")
    def voice_connector_id(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Chime Voice Connector ID.
        """
        return pulumi.get(self, "voice_connector_id")

    @voice_connector_id.setter
    def voice_connector_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "voice_connector_id", value)


class VoiceConnectorTerminationCredentials(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credentials: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VoiceConnectorTerminationCredentialsCredentialArgs']]]]] = None,
                 voice_connector_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Adds termination SIP credentials for the specified Amazon Chime Voice Connector.

        > **Note:** Voice Connector Termination Credentials requires a Voice Connector Termination to be present. Use of `depends_on` (as shown below) is recommended to avoid race conditions.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.chime.VoiceConnector("default",
            name="test",
            require_encryption=True)
        default_voice_connector_termination = aws.chime.VoiceConnectorTermination("default",
            disabled=True,
            cps_limit=1,
            cidr_allow_lists=["50.35.78.96/31"],
            calling_regions=[
                "US",
                "CA",
            ],
            voice_connector_id=default.id)
        default_voice_connector_termination_credentials = aws.chime.VoiceConnectorTerminationCredentials("default",
            voice_connector_id=default.id,
            credentials=[aws.chime.VoiceConnectorTerminationCredentialsCredentialArgs(
                username="test",
                password="test!",
            )])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Chime Voice Connector Termination Credentials using the `voice_connector_id`. For example:

        ```sh
        $ pulumi import aws:chime/voiceConnectorTerminationCredentials:VoiceConnectorTerminationCredentials default abcdef1ghij2klmno3pqr4
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VoiceConnectorTerminationCredentialsCredentialArgs']]]] credentials: List of termination SIP credentials.
        :param pulumi.Input[str] voice_connector_id: Amazon Chime Voice Connector ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VoiceConnectorTerminationCredentialsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Adds termination SIP credentials for the specified Amazon Chime Voice Connector.

        > **Note:** Voice Connector Termination Credentials requires a Voice Connector Termination to be present. Use of `depends_on` (as shown below) is recommended to avoid race conditions.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.chime.VoiceConnector("default",
            name="test",
            require_encryption=True)
        default_voice_connector_termination = aws.chime.VoiceConnectorTermination("default",
            disabled=True,
            cps_limit=1,
            cidr_allow_lists=["50.35.78.96/31"],
            calling_regions=[
                "US",
                "CA",
            ],
            voice_connector_id=default.id)
        default_voice_connector_termination_credentials = aws.chime.VoiceConnectorTerminationCredentials("default",
            voice_connector_id=default.id,
            credentials=[aws.chime.VoiceConnectorTerminationCredentialsCredentialArgs(
                username="test",
                password="test!",
            )])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Chime Voice Connector Termination Credentials using the `voice_connector_id`. For example:

        ```sh
        $ pulumi import aws:chime/voiceConnectorTerminationCredentials:VoiceConnectorTerminationCredentials default abcdef1ghij2klmno3pqr4
        ```

        :param str resource_name: The name of the resource.
        :param VoiceConnectorTerminationCredentialsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VoiceConnectorTerminationCredentialsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credentials: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VoiceConnectorTerminationCredentialsCredentialArgs']]]]] = None,
                 voice_connector_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VoiceConnectorTerminationCredentialsArgs.__new__(VoiceConnectorTerminationCredentialsArgs)

            if credentials is None and not opts.urn:
                raise TypeError("Missing required property 'credentials'")
            __props__.__dict__["credentials"] = credentials
            if voice_connector_id is None and not opts.urn:
                raise TypeError("Missing required property 'voice_connector_id'")
            __props__.__dict__["voice_connector_id"] = voice_connector_id
        super(VoiceConnectorTerminationCredentials, __self__).__init__(
            'aws:chime/voiceConnectorTerminationCredentials:VoiceConnectorTerminationCredentials',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            credentials: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VoiceConnectorTerminationCredentialsCredentialArgs']]]]] = None,
            voice_connector_id: Optional[pulumi.Input[str]] = None) -> 'VoiceConnectorTerminationCredentials':
        """
        Get an existing VoiceConnectorTerminationCredentials resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VoiceConnectorTerminationCredentialsCredentialArgs']]]] credentials: List of termination SIP credentials.
        :param pulumi.Input[str] voice_connector_id: Amazon Chime Voice Connector ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VoiceConnectorTerminationCredentialsState.__new__(_VoiceConnectorTerminationCredentialsState)

        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["voice_connector_id"] = voice_connector_id
        return VoiceConnectorTerminationCredentials(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Sequence['outputs.VoiceConnectorTerminationCredentialsCredential']]:
        """
        List of termination SIP credentials.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="voiceConnectorId")
    def voice_connector_id(self) -> pulumi.Output[str]:
        """
        Amazon Chime Voice Connector ID.
        """
        return pulumi.get(self, "voice_connector_id")

