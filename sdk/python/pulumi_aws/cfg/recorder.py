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

__all__ = ['RecorderArgs', 'Recorder']

@pulumi.input_type
class RecorderArgs:
    def __init__(__self__, *,
                 role_arn: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 recording_group: Optional[pulumi.Input['RecorderRecordingGroupArgs']] = None):
        """
        The set of arguments for constructing a Recorder resource.
        :param pulumi.Input[str] role_arn: Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
        :param pulumi.Input[str] name: The name of the recorder. Defaults to `default`. Changing it recreates the resource.
        :param pulumi.Input['RecorderRecordingGroupArgs'] recording_group: Recording group - see below.
        """
        pulumi.set(__self__, "role_arn", role_arn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if recording_group is not None:
            pulumi.set(__self__, "recording_group", recording_group)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Input[str]:
        """
        Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the recorder. Defaults to `default`. Changing it recreates the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="recordingGroup")
    def recording_group(self) -> Optional[pulumi.Input['RecorderRecordingGroupArgs']]:
        """
        Recording group - see below.
        """
        return pulumi.get(self, "recording_group")

    @recording_group.setter
    def recording_group(self, value: Optional[pulumi.Input['RecorderRecordingGroupArgs']]):
        pulumi.set(self, "recording_group", value)


@pulumi.input_type
class _RecorderState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 recording_group: Optional[pulumi.Input['RecorderRecordingGroupArgs']] = None,
                 role_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Recorder resources.
        :param pulumi.Input[str] name: The name of the recorder. Defaults to `default`. Changing it recreates the resource.
        :param pulumi.Input['RecorderRecordingGroupArgs'] recording_group: Recording group - see below.
        :param pulumi.Input[str] role_arn: Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if recording_group is not None:
            pulumi.set(__self__, "recording_group", recording_group)
        if role_arn is not None:
            pulumi.set(__self__, "role_arn", role_arn)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the recorder. Defaults to `default`. Changing it recreates the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="recordingGroup")
    def recording_group(self) -> Optional[pulumi.Input['RecorderRecordingGroupArgs']]:
        """
        Recording group - see below.
        """
        return pulumi.get(self, "recording_group")

    @recording_group.setter
    def recording_group(self, value: Optional[pulumi.Input['RecorderRecordingGroupArgs']]):
        pulumi.set(self, "recording_group", value)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_arn", value)


class Recorder(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 recording_group: Optional[pulumi.Input[pulumi.InputType['RecorderRecordingGroupArgs']]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an AWS Config Configuration Recorder. Please note that this resource **does not start** the created recorder automatically.

        > **Note:** _Starting_ the Configuration Recorder requires a delivery channel (while delivery channel creation requires Configuration Recorder). This is why `cfg.RecorderStatus` is a separate resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        assume_role = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["config.amazonaws.com"],
            )],
            actions=["sts:AssumeRole"],
        )])
        role = aws.iam.Role("role", assume_role_policy=assume_role.json)
        foo = aws.cfg.Recorder("foo", role_arn=role.arn)
        ```

        ## Import

        Using `pulumi import`, import Configuration Recorder using the name. For example:

        ```sh
         $ pulumi import aws:cfg/recorder:Recorder foo example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the recorder. Defaults to `default`. Changing it recreates the resource.
        :param pulumi.Input[pulumi.InputType['RecorderRecordingGroupArgs']] recording_group: Recording group - see below.
        :param pulumi.Input[str] role_arn: Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RecorderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an AWS Config Configuration Recorder. Please note that this resource **does not start** the created recorder automatically.

        > **Note:** _Starting_ the Configuration Recorder requires a delivery channel (while delivery channel creation requires Configuration Recorder). This is why `cfg.RecorderStatus` is a separate resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        assume_role = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["config.amazonaws.com"],
            )],
            actions=["sts:AssumeRole"],
        )])
        role = aws.iam.Role("role", assume_role_policy=assume_role.json)
        foo = aws.cfg.Recorder("foo", role_arn=role.arn)
        ```

        ## Import

        Using `pulumi import`, import Configuration Recorder using the name. For example:

        ```sh
         $ pulumi import aws:cfg/recorder:Recorder foo example
        ```

        :param str resource_name: The name of the resource.
        :param RecorderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RecorderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 recording_group: Optional[pulumi.Input[pulumi.InputType['RecorderRecordingGroupArgs']]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RecorderArgs.__new__(RecorderArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["recording_group"] = recording_group
            if role_arn is None and not opts.urn:
                raise TypeError("Missing required property 'role_arn'")
            __props__.__dict__["role_arn"] = role_arn
        super(Recorder, __self__).__init__(
            'aws:cfg/recorder:Recorder',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            recording_group: Optional[pulumi.Input[pulumi.InputType['RecorderRecordingGroupArgs']]] = None,
            role_arn: Optional[pulumi.Input[str]] = None) -> 'Recorder':
        """
        Get an existing Recorder resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the recorder. Defaults to `default`. Changing it recreates the resource.
        :param pulumi.Input[pulumi.InputType['RecorderRecordingGroupArgs']] recording_group: Recording group - see below.
        :param pulumi.Input[str] role_arn: Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RecorderState.__new__(_RecorderState)

        __props__.__dict__["name"] = name
        __props__.__dict__["recording_group"] = recording_group
        __props__.__dict__["role_arn"] = role_arn
        return Recorder(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the recorder. Defaults to `default`. Changing it recreates the resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="recordingGroup")
    def recording_group(self) -> pulumi.Output['outputs.RecorderRecordingGroup']:
        """
        Recording group - see below.
        """
        return pulumi.get(self, "recording_group")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
        """
        return pulumi.get(self, "role_arn")

