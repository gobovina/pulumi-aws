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

__all__ = ['VoiceConnectorStreamingArgs', 'VoiceConnectorStreaming']

@pulumi.input_type
class VoiceConnectorStreamingArgs:
    def __init__(__self__, *,
                 data_retention: pulumi.Input[int],
                 voice_connector_id: pulumi.Input[str],
                 disabled: Optional[pulumi.Input[bool]] = None,
                 media_insights_configuration: Optional[pulumi.Input['VoiceConnectorStreamingMediaInsightsConfigurationArgs']] = None,
                 streaming_notification_targets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a VoiceConnectorStreaming resource.
        :param pulumi.Input[int] data_retention: The retention period, in hours, for the Amazon Kinesis data.
        :param pulumi.Input[str] voice_connector_id: The Amazon Chime Voice Connector ID.
        :param pulumi.Input[bool] disabled: When true, media streaming to Amazon Kinesis is turned off. Default: `false`
        :param pulumi.Input['VoiceConnectorStreamingMediaInsightsConfigurationArgs'] media_insights_configuration: The media insights configuration. See `media_insights_configuration`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] streaming_notification_targets: The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
        """
        pulumi.set(__self__, "data_retention", data_retention)
        pulumi.set(__self__, "voice_connector_id", voice_connector_id)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if media_insights_configuration is not None:
            pulumi.set(__self__, "media_insights_configuration", media_insights_configuration)
        if streaming_notification_targets is not None:
            pulumi.set(__self__, "streaming_notification_targets", streaming_notification_targets)

    @property
    @pulumi.getter(name="dataRetention")
    def data_retention(self) -> pulumi.Input[int]:
        """
        The retention period, in hours, for the Amazon Kinesis data.
        """
        return pulumi.get(self, "data_retention")

    @data_retention.setter
    def data_retention(self, value: pulumi.Input[int]):
        pulumi.set(self, "data_retention", value)

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
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        When true, media streaming to Amazon Kinesis is turned off. Default: `false`
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disabled", value)

    @property
    @pulumi.getter(name="mediaInsightsConfiguration")
    def media_insights_configuration(self) -> Optional[pulumi.Input['VoiceConnectorStreamingMediaInsightsConfigurationArgs']]:
        """
        The media insights configuration. See `media_insights_configuration`.
        """
        return pulumi.get(self, "media_insights_configuration")

    @media_insights_configuration.setter
    def media_insights_configuration(self, value: Optional[pulumi.Input['VoiceConnectorStreamingMediaInsightsConfigurationArgs']]):
        pulumi.set(self, "media_insights_configuration", value)

    @property
    @pulumi.getter(name="streamingNotificationTargets")
    def streaming_notification_targets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
        """
        return pulumi.get(self, "streaming_notification_targets")

    @streaming_notification_targets.setter
    def streaming_notification_targets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "streaming_notification_targets", value)


@pulumi.input_type
class _VoiceConnectorStreamingState:
    def __init__(__self__, *,
                 data_retention: Optional[pulumi.Input[int]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 media_insights_configuration: Optional[pulumi.Input['VoiceConnectorStreamingMediaInsightsConfigurationArgs']] = None,
                 streaming_notification_targets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 voice_connector_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VoiceConnectorStreaming resources.
        :param pulumi.Input[int] data_retention: The retention period, in hours, for the Amazon Kinesis data.
        :param pulumi.Input[bool] disabled: When true, media streaming to Amazon Kinesis is turned off. Default: `false`
        :param pulumi.Input['VoiceConnectorStreamingMediaInsightsConfigurationArgs'] media_insights_configuration: The media insights configuration. See `media_insights_configuration`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] streaming_notification_targets: The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
        :param pulumi.Input[str] voice_connector_id: The Amazon Chime Voice Connector ID.
        """
        if data_retention is not None:
            pulumi.set(__self__, "data_retention", data_retention)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if media_insights_configuration is not None:
            pulumi.set(__self__, "media_insights_configuration", media_insights_configuration)
        if streaming_notification_targets is not None:
            pulumi.set(__self__, "streaming_notification_targets", streaming_notification_targets)
        if voice_connector_id is not None:
            pulumi.set(__self__, "voice_connector_id", voice_connector_id)

    @property
    @pulumi.getter(name="dataRetention")
    def data_retention(self) -> Optional[pulumi.Input[int]]:
        """
        The retention period, in hours, for the Amazon Kinesis data.
        """
        return pulumi.get(self, "data_retention")

    @data_retention.setter
    def data_retention(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "data_retention", value)

    @property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        When true, media streaming to Amazon Kinesis is turned off. Default: `false`
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disabled", value)

    @property
    @pulumi.getter(name="mediaInsightsConfiguration")
    def media_insights_configuration(self) -> Optional[pulumi.Input['VoiceConnectorStreamingMediaInsightsConfigurationArgs']]:
        """
        The media insights configuration. See `media_insights_configuration`.
        """
        return pulumi.get(self, "media_insights_configuration")

    @media_insights_configuration.setter
    def media_insights_configuration(self, value: Optional[pulumi.Input['VoiceConnectorStreamingMediaInsightsConfigurationArgs']]):
        pulumi.set(self, "media_insights_configuration", value)

    @property
    @pulumi.getter(name="streamingNotificationTargets")
    def streaming_notification_targets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
        """
        return pulumi.get(self, "streaming_notification_targets")

    @streaming_notification_targets.setter
    def streaming_notification_targets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "streaming_notification_targets", value)

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


class VoiceConnectorStreaming(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_retention: Optional[pulumi.Input[int]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 media_insights_configuration: Optional[pulumi.Input[pulumi.InputType['VoiceConnectorStreamingMediaInsightsConfigurationArgs']]] = None,
                 streaming_notification_targets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 voice_connector_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Adds a streaming configuration for the specified Amazon Chime Voice Connector. The streaming configuration specifies whether media streaming is enabled for sending to Amazon Kinesis.
        It also sets the retention period, in hours, for the Amazon Kinesis data.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        default_voice_connector = aws.chime.VoiceConnector("defaultVoiceConnector", require_encryption=True)
        default_voice_connector_streaming = aws.chime.VoiceConnectorStreaming("defaultVoiceConnectorStreaming",
            disabled=False,
            voice_connector_id=default_voice_connector.id,
            data_retention=7,
            streaming_notification_targets=["SQS"])
        ```
        ### Example Usage With Media Insights

        ```python
        import pulumi
        import pulumi_aws as aws

        default_voice_connector = aws.chime.VoiceConnector("defaultVoiceConnector", require_encryption=True)
        assume_role = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["mediapipelines.chime.amazonaws.com"],
            )],
            actions=["sts:AssumeRole"],
        )])
        example_role = aws.iam.Role("exampleRole", assume_role_policy=assume_role.json)
        example_stream = aws.kinesis.Stream("exampleStream", shard_count=2)
        example_media_insights_pipeline_configuration = aws.chimesdkmediapipelines.MediaInsightsPipelineConfiguration("exampleMediaInsightsPipelineConfiguration",
            resource_access_role_arn=example_role.arn,
            elements=[
                aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationElementArgs(
                    type="AmazonTranscribeCallAnalyticsProcessor",
                    amazon_transcribe_call_analytics_processor_configuration=aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationArgs(
                        language_code="en-US",
                    ),
                ),
                aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationElementArgs(
                    type="KinesisDataStreamSink",
                    kinesis_data_stream_sink_configuration=aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationElementKinesisDataStreamSinkConfigurationArgs(
                        insights_target=example_stream.arn,
                    ),
                ),
            ])
        default_voice_connector_streaming = aws.chime.VoiceConnectorStreaming("defaultVoiceConnectorStreaming",
            disabled=False,
            voice_connector_id=default_voice_connector.id,
            data_retention=7,
            streaming_notification_targets=["SQS"],
            media_insights_configuration=aws.chime.VoiceConnectorStreamingMediaInsightsConfigurationArgs(
                disabled=False,
                configuration_arn=example_media_insights_pipeline_configuration.arn,
            ))
        ```

        ## Import

        Using `pulumi import`, import Chime Voice Connector Streaming using the `voice_connector_id`. For example:

        ```sh
         $ pulumi import aws:chime/voiceConnectorStreaming:VoiceConnectorStreaming default abcdef1ghij2klmno3pqr4
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] data_retention: The retention period, in hours, for the Amazon Kinesis data.
        :param pulumi.Input[bool] disabled: When true, media streaming to Amazon Kinesis is turned off. Default: `false`
        :param pulumi.Input[pulumi.InputType['VoiceConnectorStreamingMediaInsightsConfigurationArgs']] media_insights_configuration: The media insights configuration. See `media_insights_configuration`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] streaming_notification_targets: The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
        :param pulumi.Input[str] voice_connector_id: The Amazon Chime Voice Connector ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VoiceConnectorStreamingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Adds a streaming configuration for the specified Amazon Chime Voice Connector. The streaming configuration specifies whether media streaming is enabled for sending to Amazon Kinesis.
        It also sets the retention period, in hours, for the Amazon Kinesis data.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        default_voice_connector = aws.chime.VoiceConnector("defaultVoiceConnector", require_encryption=True)
        default_voice_connector_streaming = aws.chime.VoiceConnectorStreaming("defaultVoiceConnectorStreaming",
            disabled=False,
            voice_connector_id=default_voice_connector.id,
            data_retention=7,
            streaming_notification_targets=["SQS"])
        ```
        ### Example Usage With Media Insights

        ```python
        import pulumi
        import pulumi_aws as aws

        default_voice_connector = aws.chime.VoiceConnector("defaultVoiceConnector", require_encryption=True)
        assume_role = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["mediapipelines.chime.amazonaws.com"],
            )],
            actions=["sts:AssumeRole"],
        )])
        example_role = aws.iam.Role("exampleRole", assume_role_policy=assume_role.json)
        example_stream = aws.kinesis.Stream("exampleStream", shard_count=2)
        example_media_insights_pipeline_configuration = aws.chimesdkmediapipelines.MediaInsightsPipelineConfiguration("exampleMediaInsightsPipelineConfiguration",
            resource_access_role_arn=example_role.arn,
            elements=[
                aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationElementArgs(
                    type="AmazonTranscribeCallAnalyticsProcessor",
                    amazon_transcribe_call_analytics_processor_configuration=aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationArgs(
                        language_code="en-US",
                    ),
                ),
                aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationElementArgs(
                    type="KinesisDataStreamSink",
                    kinesis_data_stream_sink_configuration=aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationElementKinesisDataStreamSinkConfigurationArgs(
                        insights_target=example_stream.arn,
                    ),
                ),
            ])
        default_voice_connector_streaming = aws.chime.VoiceConnectorStreaming("defaultVoiceConnectorStreaming",
            disabled=False,
            voice_connector_id=default_voice_connector.id,
            data_retention=7,
            streaming_notification_targets=["SQS"],
            media_insights_configuration=aws.chime.VoiceConnectorStreamingMediaInsightsConfigurationArgs(
                disabled=False,
                configuration_arn=example_media_insights_pipeline_configuration.arn,
            ))
        ```

        ## Import

        Using `pulumi import`, import Chime Voice Connector Streaming using the `voice_connector_id`. For example:

        ```sh
         $ pulumi import aws:chime/voiceConnectorStreaming:VoiceConnectorStreaming default abcdef1ghij2klmno3pqr4
        ```

        :param str resource_name: The name of the resource.
        :param VoiceConnectorStreamingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VoiceConnectorStreamingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_retention: Optional[pulumi.Input[int]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 media_insights_configuration: Optional[pulumi.Input[pulumi.InputType['VoiceConnectorStreamingMediaInsightsConfigurationArgs']]] = None,
                 streaming_notification_targets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 voice_connector_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VoiceConnectorStreamingArgs.__new__(VoiceConnectorStreamingArgs)

            if data_retention is None and not opts.urn:
                raise TypeError("Missing required property 'data_retention'")
            __props__.__dict__["data_retention"] = data_retention
            __props__.__dict__["disabled"] = disabled
            __props__.__dict__["media_insights_configuration"] = media_insights_configuration
            __props__.__dict__["streaming_notification_targets"] = streaming_notification_targets
            if voice_connector_id is None and not opts.urn:
                raise TypeError("Missing required property 'voice_connector_id'")
            __props__.__dict__["voice_connector_id"] = voice_connector_id
        super(VoiceConnectorStreaming, __self__).__init__(
            'aws:chime/voiceConnectorStreaming:VoiceConnectorStreaming',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            data_retention: Optional[pulumi.Input[int]] = None,
            disabled: Optional[pulumi.Input[bool]] = None,
            media_insights_configuration: Optional[pulumi.Input[pulumi.InputType['VoiceConnectorStreamingMediaInsightsConfigurationArgs']]] = None,
            streaming_notification_targets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            voice_connector_id: Optional[pulumi.Input[str]] = None) -> 'VoiceConnectorStreaming':
        """
        Get an existing VoiceConnectorStreaming resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] data_retention: The retention period, in hours, for the Amazon Kinesis data.
        :param pulumi.Input[bool] disabled: When true, media streaming to Amazon Kinesis is turned off. Default: `false`
        :param pulumi.Input[pulumi.InputType['VoiceConnectorStreamingMediaInsightsConfigurationArgs']] media_insights_configuration: The media insights configuration. See `media_insights_configuration`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] streaming_notification_targets: The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
        :param pulumi.Input[str] voice_connector_id: The Amazon Chime Voice Connector ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VoiceConnectorStreamingState.__new__(_VoiceConnectorStreamingState)

        __props__.__dict__["data_retention"] = data_retention
        __props__.__dict__["disabled"] = disabled
        __props__.__dict__["media_insights_configuration"] = media_insights_configuration
        __props__.__dict__["streaming_notification_targets"] = streaming_notification_targets
        __props__.__dict__["voice_connector_id"] = voice_connector_id
        return VoiceConnectorStreaming(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dataRetention")
    def data_retention(self) -> pulumi.Output[int]:
        """
        The retention period, in hours, for the Amazon Kinesis data.
        """
        return pulumi.get(self, "data_retention")

    @property
    @pulumi.getter
    def disabled(self) -> pulumi.Output[Optional[bool]]:
        """
        When true, media streaming to Amazon Kinesis is turned off. Default: `false`
        """
        return pulumi.get(self, "disabled")

    @property
    @pulumi.getter(name="mediaInsightsConfiguration")
    def media_insights_configuration(self) -> pulumi.Output[Optional['outputs.VoiceConnectorStreamingMediaInsightsConfiguration']]:
        """
        The media insights configuration. See `media_insights_configuration`.
        """
        return pulumi.get(self, "media_insights_configuration")

    @property
    @pulumi.getter(name="streamingNotificationTargets")
    def streaming_notification_targets(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
        """
        return pulumi.get(self, "streaming_notification_targets")

    @property
    @pulumi.getter(name="voiceConnectorId")
    def voice_connector_id(self) -> pulumi.Output[str]:
        """
        The Amazon Chime Voice Connector ID.
        """
        return pulumi.get(self, "voice_connector_id")

