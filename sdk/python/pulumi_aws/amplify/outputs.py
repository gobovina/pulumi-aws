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

__all__ = [
    'AppAutoBranchCreationConfig',
    'AppCustomRule',
    'AppProductionBranch',
    'DomainAssociationSubDomain',
]

@pulumi.output_type
class AppAutoBranchCreationConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "basicAuthCredentials":
            suggest = "basic_auth_credentials"
        elif key == "buildSpec":
            suggest = "build_spec"
        elif key == "enableAutoBuild":
            suggest = "enable_auto_build"
        elif key == "enableBasicAuth":
            suggest = "enable_basic_auth"
        elif key == "enablePerformanceMode":
            suggest = "enable_performance_mode"
        elif key == "enablePullRequestPreview":
            suggest = "enable_pull_request_preview"
        elif key == "environmentVariables":
            suggest = "environment_variables"
        elif key == "pullRequestEnvironmentName":
            suggest = "pull_request_environment_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in AppAutoBranchCreationConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        AppAutoBranchCreationConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        AppAutoBranchCreationConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 basic_auth_credentials: Optional[str] = None,
                 build_spec: Optional[str] = None,
                 enable_auto_build: Optional[bool] = None,
                 enable_basic_auth: Optional[bool] = None,
                 enable_performance_mode: Optional[bool] = None,
                 enable_pull_request_preview: Optional[bool] = None,
                 environment_variables: Optional[Mapping[str, str]] = None,
                 framework: Optional[str] = None,
                 pull_request_environment_name: Optional[str] = None,
                 stage: Optional[str] = None):
        """
        :param str basic_auth_credentials: Basic authorization credentials for the autocreated branch.
        :param str build_spec: Build specification (build spec) for the autocreated branch.
        :param bool enable_auto_build: Enables auto building for the autocreated branch.
        :param bool enable_basic_auth: Enables basic authorization for the autocreated branch.
        :param bool enable_performance_mode: Enables performance mode for the branch.
        :param bool enable_pull_request_preview: Enables pull request previews for the autocreated branch.
        :param Mapping[str, str] environment_variables: Environment variables for the autocreated branch.
        :param str framework: Framework for the autocreated branch.
        :param str pull_request_environment_name: Amplify environment name for the pull request.
        :param str stage: Describes the current stage for the autocreated branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
        """
        if basic_auth_credentials is not None:
            pulumi.set(__self__, "basic_auth_credentials", basic_auth_credentials)
        if build_spec is not None:
            pulumi.set(__self__, "build_spec", build_spec)
        if enable_auto_build is not None:
            pulumi.set(__self__, "enable_auto_build", enable_auto_build)
        if enable_basic_auth is not None:
            pulumi.set(__self__, "enable_basic_auth", enable_basic_auth)
        if enable_performance_mode is not None:
            pulumi.set(__self__, "enable_performance_mode", enable_performance_mode)
        if enable_pull_request_preview is not None:
            pulumi.set(__self__, "enable_pull_request_preview", enable_pull_request_preview)
        if environment_variables is not None:
            pulumi.set(__self__, "environment_variables", environment_variables)
        if framework is not None:
            pulumi.set(__self__, "framework", framework)
        if pull_request_environment_name is not None:
            pulumi.set(__self__, "pull_request_environment_name", pull_request_environment_name)
        if stage is not None:
            pulumi.set(__self__, "stage", stage)

    @property
    @pulumi.getter(name="basicAuthCredentials")
    def basic_auth_credentials(self) -> Optional[str]:
        """
        Basic authorization credentials for the autocreated branch.
        """
        return pulumi.get(self, "basic_auth_credentials")

    @property
    @pulumi.getter(name="buildSpec")
    def build_spec(self) -> Optional[str]:
        """
        Build specification (build spec) for the autocreated branch.
        """
        return pulumi.get(self, "build_spec")

    @property
    @pulumi.getter(name="enableAutoBuild")
    def enable_auto_build(self) -> Optional[bool]:
        """
        Enables auto building for the autocreated branch.
        """
        return pulumi.get(self, "enable_auto_build")

    @property
    @pulumi.getter(name="enableBasicAuth")
    def enable_basic_auth(self) -> Optional[bool]:
        """
        Enables basic authorization for the autocreated branch.
        """
        return pulumi.get(self, "enable_basic_auth")

    @property
    @pulumi.getter(name="enablePerformanceMode")
    def enable_performance_mode(self) -> Optional[bool]:
        """
        Enables performance mode for the branch.
        """
        return pulumi.get(self, "enable_performance_mode")

    @property
    @pulumi.getter(name="enablePullRequestPreview")
    def enable_pull_request_preview(self) -> Optional[bool]:
        """
        Enables pull request previews for the autocreated branch.
        """
        return pulumi.get(self, "enable_pull_request_preview")

    @property
    @pulumi.getter(name="environmentVariables")
    def environment_variables(self) -> Optional[Mapping[str, str]]:
        """
        Environment variables for the autocreated branch.
        """
        return pulumi.get(self, "environment_variables")

    @property
    @pulumi.getter
    def framework(self) -> Optional[str]:
        """
        Framework for the autocreated branch.
        """
        return pulumi.get(self, "framework")

    @property
    @pulumi.getter(name="pullRequestEnvironmentName")
    def pull_request_environment_name(self) -> Optional[str]:
        """
        Amplify environment name for the pull request.
        """
        return pulumi.get(self, "pull_request_environment_name")

    @property
    @pulumi.getter
    def stage(self) -> Optional[str]:
        """
        Describes the current stage for the autocreated branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
        """
        return pulumi.get(self, "stage")


@pulumi.output_type
class AppCustomRule(dict):
    def __init__(__self__, *,
                 source: str,
                 target: str,
                 condition: Optional[str] = None,
                 status: Optional[str] = None):
        """
        :param str source: Source pattern for a URL rewrite or redirect rule.
        :param str target: Target pattern for a URL rewrite or redirect rule.
        :param str condition: Condition for a URL rewrite or redirect rule, such as a country code.
        :param str status: Status code for a URL rewrite or redirect rule. Valid values: `200`, `301`, `302`, `404`, `404-200`.
        """
        pulumi.set(__self__, "source", source)
        pulumi.set(__self__, "target", target)
        if condition is not None:
            pulumi.set(__self__, "condition", condition)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def source(self) -> str:
        """
        Source pattern for a URL rewrite or redirect rule.
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def target(self) -> str:
        """
        Target pattern for a URL rewrite or redirect rule.
        """
        return pulumi.get(self, "target")

    @property
    @pulumi.getter
    def condition(self) -> Optional[str]:
        """
        Condition for a URL rewrite or redirect rule, such as a country code.
        """
        return pulumi.get(self, "condition")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        Status code for a URL rewrite or redirect rule. Valid values: `200`, `301`, `302`, `404`, `404-200`.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class AppProductionBranch(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "branchName":
            suggest = "branch_name"
        elif key == "lastDeployTime":
            suggest = "last_deploy_time"
        elif key == "thumbnailUrl":
            suggest = "thumbnail_url"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in AppProductionBranch. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        AppProductionBranch.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        AppProductionBranch.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 branch_name: Optional[str] = None,
                 last_deploy_time: Optional[str] = None,
                 status: Optional[str] = None,
                 thumbnail_url: Optional[str] = None):
        """
        :param str branch_name: Branch name for the production branch.
        :param str last_deploy_time: Last deploy time of the production branch.
        :param str status: Status of the production branch.
        :param str thumbnail_url: Thumbnail URL for the production branch.
        """
        if branch_name is not None:
            pulumi.set(__self__, "branch_name", branch_name)
        if last_deploy_time is not None:
            pulumi.set(__self__, "last_deploy_time", last_deploy_time)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if thumbnail_url is not None:
            pulumi.set(__self__, "thumbnail_url", thumbnail_url)

    @property
    @pulumi.getter(name="branchName")
    def branch_name(self) -> Optional[str]:
        """
        Branch name for the production branch.
        """
        return pulumi.get(self, "branch_name")

    @property
    @pulumi.getter(name="lastDeployTime")
    def last_deploy_time(self) -> Optional[str]:
        """
        Last deploy time of the production branch.
        """
        return pulumi.get(self, "last_deploy_time")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        Status of the production branch.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="thumbnailUrl")
    def thumbnail_url(self) -> Optional[str]:
        """
        Thumbnail URL for the production branch.
        """
        return pulumi.get(self, "thumbnail_url")


@pulumi.output_type
class DomainAssociationSubDomain(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "branchName":
            suggest = "branch_name"
        elif key == "dnsRecord":
            suggest = "dns_record"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainAssociationSubDomain. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainAssociationSubDomain.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainAssociationSubDomain.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 branch_name: str,
                 prefix: str,
                 dns_record: Optional[str] = None,
                 verified: Optional[bool] = None):
        """
        :param str branch_name: Branch name setting for the subdomain.
        :param str prefix: Prefix setting for the subdomain.
        :param str dns_record: DNS record for the subdomain in a space-prefixed and space-delimited format (` CNAME <target>`).
        :param bool verified: Verified status of the subdomain.
        """
        pulumi.set(__self__, "branch_name", branch_name)
        pulumi.set(__self__, "prefix", prefix)
        if dns_record is not None:
            pulumi.set(__self__, "dns_record", dns_record)
        if verified is not None:
            pulumi.set(__self__, "verified", verified)

    @property
    @pulumi.getter(name="branchName")
    def branch_name(self) -> str:
        """
        Branch name setting for the subdomain.
        """
        return pulumi.get(self, "branch_name")

    @property
    @pulumi.getter
    def prefix(self) -> str:
        """
        Prefix setting for the subdomain.
        """
        return pulumi.get(self, "prefix")

    @property
    @pulumi.getter(name="dnsRecord")
    def dns_record(self) -> Optional[str]:
        """
        DNS record for the subdomain in a space-prefixed and space-delimited format (` CNAME <target>`).
        """
        return pulumi.get(self, "dns_record")

    @property
    @pulumi.getter
    def verified(self) -> Optional[bool]:
        """
        Verified status of the subdomain.
        """
        return pulumi.get(self, "verified")


