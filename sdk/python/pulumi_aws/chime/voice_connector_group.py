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

__all__ = ['VoiceConnectorGroupArgs', 'VoiceConnectorGroup']

@pulumi.input_type
class VoiceConnectorGroupArgs:
    def __init__(__self__, *,
                 connectors: Optional[pulumi.Input[Sequence[pulumi.Input['VoiceConnectorGroupConnectorArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a VoiceConnectorGroup resource.
        :param pulumi.Input[Sequence[pulumi.Input['VoiceConnectorGroupConnectorArgs']]] connectors: The Amazon Chime Voice Connectors to route inbound calls to.
        :param pulumi.Input[str] name: The name of the Amazon Chime Voice Connector group.
        """
        if connectors is not None:
            pulumi.set(__self__, "connectors", connectors)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def connectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VoiceConnectorGroupConnectorArgs']]]]:
        """
        The Amazon Chime Voice Connectors to route inbound calls to.
        """
        return pulumi.get(self, "connectors")

    @connectors.setter
    def connectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VoiceConnectorGroupConnectorArgs']]]]):
        pulumi.set(self, "connectors", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Amazon Chime Voice Connector group.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _VoiceConnectorGroupState:
    def __init__(__self__, *,
                 connectors: Optional[pulumi.Input[Sequence[pulumi.Input['VoiceConnectorGroupConnectorArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VoiceConnectorGroup resources.
        :param pulumi.Input[Sequence[pulumi.Input['VoiceConnectorGroupConnectorArgs']]] connectors: The Amazon Chime Voice Connectors to route inbound calls to.
        :param pulumi.Input[str] name: The name of the Amazon Chime Voice Connector group.
        """
        if connectors is not None:
            pulumi.set(__self__, "connectors", connectors)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def connectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VoiceConnectorGroupConnectorArgs']]]]:
        """
        The Amazon Chime Voice Connectors to route inbound calls to.
        """
        return pulumi.get(self, "connectors")

    @connectors.setter
    def connectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VoiceConnectorGroupConnectorArgs']]]]):
        pulumi.set(self, "connectors", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Amazon Chime Voice Connector group.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class VoiceConnectorGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connectors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VoiceConnectorGroupConnectorArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates an Amazon Chime Voice Connector group under the administrator's AWS account. You can associate Amazon Chime Voice Connectors with the Amazon Chime Voice Connector group by including VoiceConnectorItems in the request.

        You can include Amazon Chime Voice Connectors from different AWS Regions in your group. This creates a fault tolerant mechanism for fallback in case of availability events.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        vc1 = aws.chime.VoiceConnector("vc1",
            name="connector-test-1",
            require_encryption=True,
            aws_region="us-east-1")
        vc2 = aws.chime.VoiceConnector("vc2",
            name="connector-test-2",
            require_encryption=True,
            aws_region="us-west-2")
        group = aws.chime.VoiceConnectorGroup("group",
            name="test-group",
            connectors=[
                aws.chime.VoiceConnectorGroupConnectorArgs(
                    voice_connector_id=vc1.id,
                    priority=1,
                ),
                aws.chime.VoiceConnectorGroupConnectorArgs(
                    voice_connector_id=vc2.id,
                    priority=3,
                ),
            ])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Configuration Recorder using the name. For example:

        ```sh
        $ pulumi import aws:chime/voiceConnectorGroup:VoiceConnectorGroup default example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VoiceConnectorGroupConnectorArgs']]]] connectors: The Amazon Chime Voice Connectors to route inbound calls to.
        :param pulumi.Input[str] name: The name of the Amazon Chime Voice Connector group.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[VoiceConnectorGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates an Amazon Chime Voice Connector group under the administrator's AWS account. You can associate Amazon Chime Voice Connectors with the Amazon Chime Voice Connector group by including VoiceConnectorItems in the request.

        You can include Amazon Chime Voice Connectors from different AWS Regions in your group. This creates a fault tolerant mechanism for fallback in case of availability events.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        vc1 = aws.chime.VoiceConnector("vc1",
            name="connector-test-1",
            require_encryption=True,
            aws_region="us-east-1")
        vc2 = aws.chime.VoiceConnector("vc2",
            name="connector-test-2",
            require_encryption=True,
            aws_region="us-west-2")
        group = aws.chime.VoiceConnectorGroup("group",
            name="test-group",
            connectors=[
                aws.chime.VoiceConnectorGroupConnectorArgs(
                    voice_connector_id=vc1.id,
                    priority=1,
                ),
                aws.chime.VoiceConnectorGroupConnectorArgs(
                    voice_connector_id=vc2.id,
                    priority=3,
                ),
            ])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Configuration Recorder using the name. For example:

        ```sh
        $ pulumi import aws:chime/voiceConnectorGroup:VoiceConnectorGroup default example
        ```

        :param str resource_name: The name of the resource.
        :param VoiceConnectorGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VoiceConnectorGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connectors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VoiceConnectorGroupConnectorArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VoiceConnectorGroupArgs.__new__(VoiceConnectorGroupArgs)

            __props__.__dict__["connectors"] = connectors
            __props__.__dict__["name"] = name
        super(VoiceConnectorGroup, __self__).__init__(
            'aws:chime/voiceConnectorGroup:VoiceConnectorGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            connectors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VoiceConnectorGroupConnectorArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'VoiceConnectorGroup':
        """
        Get an existing VoiceConnectorGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VoiceConnectorGroupConnectorArgs']]]] connectors: The Amazon Chime Voice Connectors to route inbound calls to.
        :param pulumi.Input[str] name: The name of the Amazon Chime Voice Connector group.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VoiceConnectorGroupState.__new__(_VoiceConnectorGroupState)

        __props__.__dict__["connectors"] = connectors
        __props__.__dict__["name"] = name
        return VoiceConnectorGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def connectors(self) -> pulumi.Output[Optional[Sequence['outputs.VoiceConnectorGroupConnector']]]:
        """
        The Amazon Chime Voice Connectors to route inbound calls to.
        """
        return pulumi.get(self, "connectors")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Amazon Chime Voice Connector group.
        """
        return pulumi.get(self, "name")

